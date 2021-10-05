package com.openlab.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/send/{str}")
    public  String send(@PathVariable("str") String str)
    {
        jmsMessagingTemplate.convertAndSend("queue",str);
        return "success send";
    }
}
