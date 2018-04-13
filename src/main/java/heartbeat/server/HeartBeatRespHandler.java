package heartbeat.server;

import heartbeat.message.Header;
import heartbeat.message.Message;
import heartbeat.message.MessageType;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/31 下午4:36
 */
public class HeartBeatRespHandler extends ChannelHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Message message = (Message)msg;
        if(message.getHeader() != null && message.getHeader().getType() == MessageType.HEARTBEAT_REQ.value()) {
            System.out.println("Receive client heart beat message : " + message);
            Message heartBeat = buildHeartBeat();
            System.out.println("Send heart beat response message to client : " + heartBeat);
            ctx.writeAndFlush(heartBeat);
        } else{
            ctx.fireChannelRead(msg);
        }
    }

    private Message buildHeartBeat(){
        Message message = new Message();
        Header header = new Header();
        header.setType(MessageType.HEARTBEAT_RESP.value());
        message.setHeader(header);
        return message;
    }
}
