package com.rabbitMQPractice.rabbitMQPractice.routing;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RoutingConsumer1 {
    @RabbitListener(queues = "routing_queue_1")
    public void receive(Student student){
        System.out.printf("subscribe routing_queue_1 receive msg: %s %n", student);

    }
}
