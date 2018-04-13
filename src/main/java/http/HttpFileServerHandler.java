package http;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;

import java.io.File;
import java.util.logging.Logger;

import static io.netty.handler.codec.http.HttpHeaderNames.*;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/26 下午2:44
 */
public class HttpFileServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

    private Logger logger = Logger.getLogger(HttpFileServerHandler.class.getName());

    private String BASE_URL = "/Users/icsoc/work/code/netty/src/main/java";

    protected void messageReceived(ChannelHandlerContext channelHandlerContext, FullHttpRequest request) throws Exception {
        if(!request.decoderResult().isSuccess()){
            sendError(channelHandlerContext, "请求不成功");
            return;
        }
        if(request.method() != HttpMethod.GET){
            sendError(channelHandlerContext, "请求方式异常");
            return;
        }
        final StringBuffer filePath = new StringBuffer(BASE_URL);
        final String uri = request.uri();
        if(uri != null && uri != ""){
            filePath.append(uri);
        }
        File file = new File(filePath.toString());
        if(file.isHidden() || !file.exists()){
            sendError(channelHandlerContext, "文件不存在或隐藏");
            return;
        }
        if(file.isFile()){

        }
        sendDir(channelHandlerContext, file, uri);
        return;
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.warning(cause.getMessage());
    }

    private void sendDir(ChannelHandlerContext channelHandlerContext, File file, String uri){
        String html = combineHtml(file, uri);
        FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(html.getBytes()));
        response.headers().set(CONTENT_TYPE, "text/html; charset=UTF-8");
        response.headers().setInt(CONTENT_LENGTH, response.content().readableBytes());
        response.headers().set(CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        channelHandlerContext.writeAndFlush(response);
    }

    private String combineHtml(File file, String uri){
        StringBuffer html = new StringBuffer("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>Title</title></head><body>");
        if(!uri.equals("/")){
            uri = uri + "/";
        }
        for (File f: file.listFiles()) {
            boolean directory = f.isDirectory();
            String aHtml = "";
            if(directory){
                aHtml = "<a href='" + uri + f.getName() + "'>" + f.getName() + "</a><br />";
            }else{
                aHtml = "<a href='" + uri + f.getName() + "' download>" + f.getName() + "</a><br />";
            }
            html.append(aHtml);
        }
        html.append("</body></html>");
        return html.toString();
    }

    private void sendError(ChannelHandlerContext channelHandlerContext, String msg){
        FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(msg.getBytes()));
        response.headers().set(CONTENT_TYPE, "text/plain; charset=UTF-8");
        response.headers().setInt(CONTENT_LENGTH, response.content().readableBytes());
        response.headers().set(CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        channelHandlerContext.writeAndFlush(response);
    }
}
