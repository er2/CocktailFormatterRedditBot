package se.ericrie.cocktailformatter;

import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;

import java.util.Base64;
import java.util.logging.Logger;

public class Reader implements BackgroundFunction<PubSubMessage> {

    private static final Logger logger = Logger.getLogger(Reader.class.getName());

    @Override
    public void accept(PubSubMessage message, Context context) {
        String data = message.data != null
                ? new String(Base64.getDecoder().decode(message.data))
                : "Hello, World";
        logger.info(data);
    }
}
