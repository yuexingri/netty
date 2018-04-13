package protobuf;

import entities.SubscribeRespProto;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.util.Date;
import java.util.logging.Logger;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/26 上午11:13
 */
public class SubRespServerHandler extends ChannelHandlerAdapter {
    private Logger logger = Logger.getLogger(SubRespServerHandler.class.getName());

    private int counter;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        SubscribeRespProto.SubscribeResp resp = (SubscribeRespProto.SubscribeResp) msg;
        String bookname = resp.getBookname();
        String username = resp.getUsername();
        System.out.println("**********************************************************");
        System.out.println("the server receive order for : " + bookname + " and the customer is " + username);
        SubscribeRespProto.SubscribeResp order = createOrder(bookname, username);
        System.out.println("order producted :");
        System.out.println(order.toString());
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        ctx.writeAndFlush(order);
    }

    private SubscribeRespProto.SubscribeResp createOrder(String bookname, String username){
        SubscribeRespProto.SubscribeResp.Builder builder = SubscribeRespProto.SubscribeResp.newBuilder();
        int id = ++counter;
        builder.setSubReqID(id);
        builder.setRespCode(id);
        builder.setBookname(bookname);
        builder.setUsername(username);
        builder.setDesc("the book will be sent at " + new Date());
        return builder.build();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.warning("服务端出错:" + cause.getMessage());
        ctx.close();
    }
}
