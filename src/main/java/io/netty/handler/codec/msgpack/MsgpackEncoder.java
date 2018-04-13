package io.netty.handler.codec.msgpack;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.msgpack.MessagePack;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/25 下午1:39
 */
public class MsgpackEncoder extends MessageToByteEncoder<Object> {

    protected void encode(ChannelHandlerContext channelHandlerContext, Object o, ByteBuf byteBuf) throws Exception {
        MessagePack messagePack = new MessagePack();
        byte[] raws = messagePack.write(o);
        byteBuf.writeBytes(raws);
    }
}
