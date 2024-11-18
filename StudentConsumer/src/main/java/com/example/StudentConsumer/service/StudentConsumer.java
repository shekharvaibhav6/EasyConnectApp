package com.example.StudentConsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentConsumer {

    @Autowired
    KafkaTemplate kafkaTemplate;
    public String topic_name2="Teacher-Info";
    public void sendMessage(String msg2){
        kafkaTemplate.send(topic_name2,msg2);
    }

    @KafkaListener(topics = "Student-Info",groupId = "student-group")
    public void consumeMsg(String msg){
        System.out.println("Message from User2 : "+msg);
    }


}
