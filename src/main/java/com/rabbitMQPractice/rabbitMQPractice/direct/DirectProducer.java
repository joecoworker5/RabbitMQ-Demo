package com.rabbitMQPractice.rabbitMQPractice.direct;

import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import org.springframework.stereotype.Component;

@Component
public class DirectProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(Student student){
        rabbitTemplate.convertAndSend("direct_queue", student,  message -> {
            message.getMessageProperties().setDeliveryMode(MessageDeliveryMode.PERSISTENT); //消息持久化, 確保訊息不會丟失, 預設也是
            return message;
        });
    }
}
