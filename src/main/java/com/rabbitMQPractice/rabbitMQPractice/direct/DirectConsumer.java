package com.rabbitMQPractice.rabbitMQPractice.direct;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import org.springframework.stereotype.Component;

@Component
public class DirectConsumer {

    @RabbitListener(queues="direct_queue")
    public void receive(Student student){
        System.out.println("Received direct message: " + student.toString());
    }
}
