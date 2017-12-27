package org.jozif.demo4springwebsocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    public SimpMessagingTemplate template;

    @Autowired
    public WebSocketController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @MessageMapping("/hello")
    @SendTo("/topic/hello")
    public WebSocketStandardMessage greeting(WebSocketStandardMessage message) throws Exception {
        return message;
    }

    @MessageMapping("/message")
    @SendToUser("/message")
    public WebSocketStandardMessage userMessage(WebSocketStandardMessage userMessage) throws Exception {
        return userMessage;
    }

}
