package com.rabbitMQPractice.rabbitMQPractice.topic;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;

@Component
public class TopicConsumer2 {

    @RabbitListener(queues = "topic_queue_2")
    public void receive(Student student){
        System.out.printf("subscribe topic_queue_2 receive msg: %s %n", student);
    }
}
