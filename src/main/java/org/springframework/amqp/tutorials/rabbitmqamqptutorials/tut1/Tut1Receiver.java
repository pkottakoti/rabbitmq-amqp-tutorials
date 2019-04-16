package org.springframework.amqp.tutorials.rabbitmqamqptutorials.tut1;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.util.Date;

@RabbitListener(queues = "hello")
public class Tut1Receiver {
    @RabbitHandler
    public void receive(String in) {
        long timeDiff= new Date().getTime()-Long.parseLong(in.split("@")[1]);
        System.out.println(" [x] Received '" + in + "' " +timeDiff);
    }
}
