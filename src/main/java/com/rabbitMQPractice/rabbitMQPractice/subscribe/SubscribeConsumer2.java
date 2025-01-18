package com.rabbitMQPractice.rabbitMQPractice.subscribe;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SubscribeConsumer2 {

    @RabbitListener(queues = "subscribe_queue_2")
    public void receive(Student student){
        System.out.printf("subscribe subscribe_queue_2 receive msg: %s %n", student);
    }
}
