package com.rabbitMQPractice.rabbitMQPractice.worker;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;

@Component
public class WorkerProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    
    public void send(Student student){
        rabbitTemplate.convertAndSend("worker_queue", student);
        System.out.println("send message to worker_queue:" + student.toString());
    }
}
