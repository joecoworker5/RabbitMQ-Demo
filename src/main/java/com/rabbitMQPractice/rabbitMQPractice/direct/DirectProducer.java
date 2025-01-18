package com.rabbitMQPractice.rabbitMQPractice.direct;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import org.springframework.stereotype.Component;

@Component
public class DirectProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(Student student){
        rabbitTemplate.convertAndSend("direct_queue", student);
    }
}
