package encoder_decoder.masharlling;
import io.netty.handler.codec.marshalling.DefaultMarshallerProvider;
import io.netty.handler.codec.marshalling.DefaultUnmarshallerProvider;
import io.netty.handler.codec.marshalling.MarshallerProvider;
import io.netty.handler.codec.marshalling.MarshallingDecoder;
import io.netty.handler.codec.marshalling.MarshallingEncoder;
import io.netty.handler.codec.marshalling.UnmarshallerProvider;

import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.Marshalling;
import org.jboss.marshalling.MarshallingConfiguration;
/**
 * @ 创建人 贾红平
 * @ 创建时间 2018/6/24
 * @ 功能描述 调用jboss marshalling实现对象的编码和解码功能
 */
public class MarshallingCodeCFactory {
    /**
     * 创建Jboss Marshalling解码器MarshallingDecoder
     *
     * @return
     */
    public static MarshallingDecoder buildMarshallingDecoder() {
        final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("serial");
        final MarshallingConfiguration configuration = new MarshallingConfiguration();
        configuration.setVersion(5);
        UnmarshallerProvider provider = new DefaultUnmarshallerProvider(marshallerFactory, configuration);
        MarshallingDecoder decoder = new MarshallingDecoder(provider, 1024);
        return decoder;
    }

    /**
     * 创建Jboss Marshalling编码器MarshallingEncoder
     *
     * @return
     */
    public static MarshallingEncoder buildMarshallingEncoder() {
        final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("serial");
        final MarshallingConfiguration configuration = new MarshallingConfiguration();
        configuration.setVersion(5);
        MarshallerProvider provider = new DefaultMarshallerProvider(marshallerFactory, configuration);
        MarshallingEncoder encoder = new MarshallingEncoder(provider);
        return encoder;
    }
}
