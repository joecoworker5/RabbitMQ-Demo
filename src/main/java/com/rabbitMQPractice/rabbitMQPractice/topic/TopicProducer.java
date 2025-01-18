package com.rabbitMQPractice.rabbitMQPractice.topic;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;

@Component
public class TopicProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    
    public void send(Student student, String routingKey){
        rabbitTemplate.convertAndSend("topic_exchange", routingKey, student);
    }
    
    

}
