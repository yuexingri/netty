package heartbeat.server;

import heartbeat.message.Header;
import heartbeat.message.Message;
import heartbeat.message.MessageType;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/31 下午4:00
 */
public class LoginAuthRespHeader extends ChannelHandlerAdapter {

    private Map<String, Object> nodeCheck = new ConcurrentHashMap<String, Object>();
    private String[] whiteList = {"127.0.0.1", "192.168.96.82"};

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Message message = (Message) msg;
        if(message.getHeader() != null && message.getHeader().getType() == MessageType.LOGIN_REQ.value()){
            String nodeIndex = ctx.channel().remoteAddress().toString();
            Message loginResp = null;
            if(nodeCheck.containsKey(nodeIndex)){
                loginResp = buildResponse((byte)-1);
            }else{
                InetSocketAddress address = (InetSocketAddress)ctx.channel().remoteAddress();
                String ip = address.getAddress().getHostAddress();
                boolean isOk = false;
                for (String WIP: whiteList) {
                    if(WIP.equals(ip)){
                        isOk = true;
                        break;
                    }
                }
                loginResp = isOk? buildResponse((byte) 0): buildResponse((byte) -1);
                if(isOk){
                    nodeCheck.put(nodeIndex, true);
                }
            }
            System.out.println("The Login response is : " + loginResp + " body [" + loginResp.getBody() + "]");
            ctx.writeAndFlush(loginResp);
        } else{
            ctx.fireChannelRead(msg);
        }
    }

    private Message buildResponse(byte b) {
        Message message = new Message();
        Header header = new Header();
        header.setType(MessageType.LOGIN_RESP.value());
        message.setHeader(header);
        message.setBody(b);
        return message;
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        nodeCheck.remove(ctx.channel().remoteAddress().toString());//删除缓存
        ctx.close();
    }
}
