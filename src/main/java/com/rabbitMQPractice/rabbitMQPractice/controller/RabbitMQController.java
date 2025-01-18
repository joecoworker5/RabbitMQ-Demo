package com.rabbitMQPractice.rabbitMQPractice.controller;

import com.rabbitMQPractice.rabbitMQPractice.routing.RoutingProducer;
import com.rabbitMQPractice.rabbitMQPractice.subscribe.SubscribeProducer;
import com.rabbitMQPractice.rabbitMQPractice.topic.TopicProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rabbitMQPractice.rabbitMQPractice.direct.DirectProducer;
import com.rabbitMQPractice.rabbitMQPractice.dto.Student;
import com.rabbitMQPractice.rabbitMQPractice.worker.WorkerProducer;

@RestController
public class RabbitMQController {

    @Autowired
    private DirectProducer directProducer;

    @Autowired
    private WorkerProducer workerProducer;

    @Autowired
    private SubscribeProducer subscribeProducer;

    @Autowired
    private RoutingProducer routingProducer;

    @Autowired
    private TopicProducer topicProducer;

    @GetMapping("direct/send")
    public void directSend(){
        Student student = new Student("direct_id", "joe.su", "joe.su@gmail.com");
        directProducer.send(student);
    }


    @GetMapping("worker/send")
    public void workerSend(){
        Student student1 = new Student("worker_id_1", "worker_name_1", "worker_email_1");
        Student student2 = new Student("worker_id_2", "worker_name_2", "worker_email_2");
        Student student3 = new Student("worker_id_3", "worker_name_3", "worker_email_3");
        workerProducer.send(student1);
        workerProducer.send(student2);
        workerProducer.send(student3);
    }

    @GetMapping("subscribe/send")
    public void subscribeSend(){
        Student student = new Student("subscribe_id_1", "subscribe_name_1", "subscribe_email_1");
        subscribeProducer.send(student);
    }

    @GetMapping("routing/send/{routingKey}")
    public void routingSend(@PathVariable String routingKey){
        Student student = new Student("routing_id_1", "routing_name_1", "routing_email_1");
        routingProducer.send(student, routingKey);
    }

    @GetMapping("topic/send/{routingKey}")
    public void topicSend(@PathVariable String routingKey){
        Student student = new Student("topic_id_1", "topic_name_1", "topic_email_1");
        topicProducer.send(student, routingKey);
    }

    
}
