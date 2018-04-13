import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.util.logging.Logger;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/25 上午11:14
 */
@ChannelHandler.Sharable
public class EchoClientHandler extends ChannelHandlerAdapter {
    private Logger logger = Logger.getLogger(EchoClientHandler.class.getName());
    private int counter;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        UserInfo[] userInfos = getuserInfo();
        for (int i = 0; i < 100; i++) {
            ctx.write(userInfos[i]);
        }
        ctx.flush();
    }

    private UserInfo[] getuserInfo(){
        UserInfo[] userInfos = new UserInfo[100];
        for (int i = 0; i < 100 ; i++) {
            userInfos[i] = new UserInfo("whf", 22);
        }
        return userInfos;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("the Client receive : " + msg + "; the counter is :" + ++counter);
//        ctx.writeAndFlush(msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.warning(cause.getMessage());
        ctx.close();
    }
}
