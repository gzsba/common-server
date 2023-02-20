package org.example.mapper;

import org.example.model.UserInfo;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Service
public class TestMapperImpl implements TestMapper {
    @Override
    public int insert(UserInfo info) {

        return 0;
    }

    public static void main(String[] args) throws IOException {
        String str = "test";
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String encoderStr = base64Encoder.encode(str.getBytes(StandardCharsets.UTF_8));
        BASE64Decoder base64Decoder = new BASE64Decoder();
        byte[] decoderByte = base64Decoder.decodeBuffer(encoderStr );
        String decoderStr = new String(decoderByte);
        System.out.println(decoderStr);
    }
}
