package heartbeat.codec;

import io.netty.handler.codec.marshalling.*;
import org.jboss.marshalling.*;

import java.io.IOException;

/**
 * Simple to Introduction
 *
 * @ProjectName: netty$
 * @Description: Describes the function of the class
 * @Author: whf
 * @CreateDate: 2018/1/31 下午1:31
 */
public class MarshallingCodecFactory {

    public static MarshallingDecoder buildMarshalling() throws IOException {
        final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("serial");
        final MarshallingConfiguration configuration = new MarshallingConfiguration();
        configuration.setVersion(5);
        UnmarshallerProvider unmarshallerProvider = new DefaultUnmarshallerProvider(marshallerFactory, configuration);
        MarshallingDecoder decoder = new MarshallingDecoder(unmarshallerProvider, 1024);
        return decoder;
    }

    public static MarshallingEncoder buildUnMarshalling() throws IOException {
        final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("serial");
        final MarshallingConfiguration configuration = new MarshallingConfiguration();
        configuration.setVersion(5);
        MarshallerProvider marshallerProvider = new DefaultMarshallerProvider(marshallerFactory, configuration);
        MarshallingEncoder encoder = new MarshallingEncoder(marshallerProvider);
        return encoder;
    }
}
