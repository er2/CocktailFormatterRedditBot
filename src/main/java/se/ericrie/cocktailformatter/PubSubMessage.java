package se.ericrie.cocktailformatter;

import java.util.Map;

public class PubSubMessage {
    String data;
    Map<String, String> attributes;
    String messageId;
    String publishTime;
}