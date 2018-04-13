package websocket;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.websocketx.*;
import io.netty.util.CharsetUtil;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import static io.netty.handler.codec.http.HttpHeaderUtil.isKeepAlive;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/29 下午5:18
 */
public class WebSocketServerHandler extends SimpleChannelInboundHandler<Object> {

    private final Logger logger = Logger.getLogger(WebSocketServerHandler.class.getName());

    private WebSocketServerHandshaker webSocketServerHandshaker;

    protected void messageReceived(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception {
        if (msg instanceof FullHttpRequest){
            handleHttpRequest(channelHandlerContext, (FullHttpRequest)msg);
        }
        if(msg instanceof WebSocketFrame){
            handleWebSocketFrame(channelHandlerContext, (WebSocketFrame)msg);
        }
    }

    private void handleHttpRequest(ChannelHandlerContext channelHandlerContext, FullHttpRequest req) {
        if(!req.decoderResult().isSuccess() || (!"websocket".equals(req.headers().get("Upgrade")))){
            sendHttpResponse(channelHandlerContext, req, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
        }
        WebSocketServerHandshakerFactory webSocketServerHandshakerFactory = new WebSocketServerHandshakerFactory("ws://localhost:9999/websocket", null, false);
        webSocketServerHandshaker = webSocketServerHandshakerFactory.newHandshaker(req);
        if(webSocketServerHandshaker == null){
            WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(channelHandlerContext.channel());
        }else{
            webSocketServerHandshaker.handshake(channelHandlerContext.channel(), req);
        }
    }

    private void handleWebSocketFrame(ChannelHandlerContext channelHandlerContext, WebSocketFrame frame) {
        //判断是否是关闭链路请求
        if(frame instanceof CloseWebSocketFrame){
            webSocketServerHandshaker.close(channelHandlerContext.channel(), (CloseWebSocketFrame) frame.retain());
        }
        //判断是不是ping请求
        if(frame instanceof PingWebSocketFrame){
            channelHandlerContext.channel().write(new PongWebSocketFrame(frame.content().retain()));
            return;
        }
        //只能接受文本消息
        if(!(frame instanceof TextWebSocketFrame)){
            throw  new UnsupportedOperationException("不是文本消息,不支持");
        }
        //返回应答消息
        String request = ((TextWebSocketFrame) frame).text();
        if(logger.isLoggable(Level.FINE)){
            logger.fine("received:" + request);
        }
        channelHandlerContext.channel().write(new TextWebSocketFrame(request + ", 欢迎使用netty WebSocket服务, 现在时刻:" + new Date()));
    }

    private static void sendHttpResponse(ChannelHandlerContext channelHandlerContext, FullHttpRequest request, FullHttpResponse response){
        if(response.status().code() != 200){
            ByteBuf buf = Unpooled.copiedBuffer(response.status().toString(), CharsetUtil.UTF_8);
            response.content().writeBytes(buf);
            buf.release();

        }
        //如果是非keep-alive,关闭连接
        ChannelFuture future = channelHandlerContext.channel().writeAndFlush(response);
        if(!isKeepAlive(request) || response.status().code() != 200){
            future.addListener(ChannelFutureListener.CLOSE);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.warning("服务器错误:" + cause.getMessage());
        ctx.close();
    }
}
