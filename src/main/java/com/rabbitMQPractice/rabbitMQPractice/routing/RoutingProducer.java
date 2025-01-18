package com.rabbitMQPractice.rabbitMQPractice.routing;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoutingProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void send(Student student, String routingKey){
        rabbitTemplate.convertAndSend("routing_exchange", routingKey, student);
        System.out.printf("send message: %s to routing exchange, routingKey: %s %n", student, routingKey);
    }
}
