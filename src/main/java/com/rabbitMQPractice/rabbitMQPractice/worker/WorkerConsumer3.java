package com.rabbitMQPractice.rabbitMQPractice.worker;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;


@Component
public class WorkerConsumer3 {


    @RabbitListener(queues="worker_queue")
    public void receive(Student student){
        System.out.println("Received worker3 message: " + student.toString());
    }
}
