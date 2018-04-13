package io.netty.handler.codec.msgpack;

import entities.UserInfo;
import org.msgpack.MessagePack;
import org.msgpack.template.Templates;
import org.msgpack.type.Value;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/2/1 下午4:19
 */
public class TestCodec {
    public static void main(String[] args) throws IOException {
        List<UserInfo> users = new ArrayList<UserInfo>();
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(12);
        userInfo.setName("whf");
        users.add(userInfo);
        MessagePack messagePack = new MessagePack();
        byte[] bytes = messagePack.write(users);
        Value read = messagePack.read(bytes);
    }
}
