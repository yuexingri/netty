package heartbeat.client;

import heartbeat.message.Header;
import heartbeat.message.Message;
import heartbeat.message.MessageType;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.util.logging.Logger;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/31 下午3:33
 */
public class LoginAuthReqHandler extends ChannelHandlerAdapter {
    private final Logger logger = Logger.getLogger(LoginAuthReqHandler.class.getName());

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(buildLoginReq());
    }

    private Message buildLoginReq(){
        Message message = new Message();
        Header header = new Header();
        header.setType(MessageType.LOGIN_REQ.value());
        message.setHeader(header);
        return message;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Message message = (Message)msg;
        //
        if(message.getHeader() != null && message.getHeader().getType() == MessageType.LOGIN_RESP.value()){
            Byte loginResult = (Byte) message.getBody();
            if(loginResult != (byte)0){
                //握手失败
                ctx.close();
            }else{
                System.out.println("Login is OK:" + message);
                ctx.fireChannelRead(msg);
            }
        }else{
            ctx.fireChannelRead(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.warning(cause.getMessage());
        ctx.close();
    }
}
