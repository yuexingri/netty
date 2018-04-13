package http;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpRequestEncoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/26 下午2:29
 */
public class HttpFileServer {
    public void run(final int port) throws InterruptedException {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workerGroup)
                           .channel(NioServerSocketChannel.class)
                           .option(ChannelOption.SO_BACKLOG, 128)
                           .childHandler(new ChannelInitializer<SocketChannel>() {
                               protected void initChannel(SocketChannel socketChannel) throws Exception {
                                   socketChannel.pipeline().addLast("http-decoder", new HttpRequestDecoder());
                                   socketChannel.pipeline().addLast("http-aggregator", new HttpObjectAggregator(65535));
                                   socketChannel.pipeline().addLast("http-encoder", new HttpResponseEncoder());
                                   socketChannel.pipeline().addLast("http-chunked", new ChunkedWriteHandler());
                                   socketChannel.pipeline().addLast(new HttpFileServerHandler());
                               }
                           });
            ChannelFuture future = serverBootstrap.bind(port).sync();
            System.out.println("文件服务器已启动:地址为http://localhost:" + port);
            future.channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int port = 9999;
        new HttpFileServer().run(port);
    }
}
