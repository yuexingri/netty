import org.msgpack.MessagePack;
import org.msgpack.template.Templates;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/25 下午1:07
 */
public class MsgPack {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        MessagePack messagePack = new MessagePack();
        byte[] bytes = messagePack.write(list);
        List<String> read = messagePack.read(bytes, Templates.tList(Templates.TString));
        System.out.println(read.get(0));
        System.out.println(read.get(1));
        System.out.println(read.get(2));

    }
}
