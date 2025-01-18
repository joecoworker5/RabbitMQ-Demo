package com.rabbitMQPractice.rabbitMQPractice.subscribe;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubscribeProducer {
    @Autowired
    public RabbitTemplate rabbitTemplate;

    public void send(Student student){
        rabbitTemplate.convertAndSend("subscribe_exchange", "", student);
        System.out.printf("send message: %s to subscribe exchange%n", student);
        
    }
}
