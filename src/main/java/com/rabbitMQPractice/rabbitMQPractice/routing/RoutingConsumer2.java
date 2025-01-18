package com.rabbitMQPractice.rabbitMQPractice.routing;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RoutingConsumer2 {

    @RabbitListener(queues = "routing_queue_2")
    public void receive(Student student){
        System.out.printf("subscribe routing_queue_2 receive msg: %s %n", student);
    }
}
