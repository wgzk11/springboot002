package com.openlab.confg;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageDeliver {

    @JmsListener(destination = "queue")
    public void  readMessage(String text)
    {
        System.out.println(text);
    }
}
