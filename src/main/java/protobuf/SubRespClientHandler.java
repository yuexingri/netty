package protobuf;

import entities.SubscribeRespProto;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.util.logging.Logger;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/26 上午11:35
 */
public class SubRespClientHandler extends ChannelHandlerAdapter {
    private Logger logger = Logger.getLogger(SubRespClientHandler.class.getName());

    private int counter;

    private String[] booknames = new String[]{"netty", "hadoop", "spark", "hive", "presto"};

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for (String bookname: booknames) {
            SubscribeRespProto.SubscribeResp resp = createResp(bookname);
            ctx.write(resp);
        }
        ctx.flush();
    }

    private SubscribeRespProto.SubscribeResp createResp(String bookname){
        return SubscribeRespProto.SubscribeResp.newBuilder()
                .setBookname(bookname)
                .setSubReqID(1)
                .setRespCode(1)
                .setDesc("buy book")
                .setUsername("whf")
                .build();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        SubscribeRespProto.SubscribeResp resp = (SubscribeRespProto.SubscribeResp) msg;
        System.out.println("*************************************************");
        System.out.println("the client receive the response : ");
        System.out.println(resp.toString());
        System.out.println("*************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.warning("客户端异常 : " + cause.getMessage());
        ctx.close();
    }
}
