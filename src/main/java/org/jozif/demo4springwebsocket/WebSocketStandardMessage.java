package org.jozif.demo4springwebsocket;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebSocketStandardMessage {
    private String timestamp;
    private String content;
    private String type;
    private String from;
    private String to;

    @Override
    public String toString() {
        return "WebSocketStandardMessage{" +
                "timestamp='" + timestamp + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
