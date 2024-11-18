package com.example.StudentInfoChatSystem.service;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    KafkaTemplate kafkaTemplate;
    public String topic_name="Student-Info";
    public void sendMessage(String msg){

        kafkaTemplate.send(topic_name,msg);
    }


    @KafkaListener(topics = "Teacher-Info",groupId = "Teacher-group")
    public void consumeMsg(String msg){
        System.out.println("Teacher Info Group Message Recieved : "+msg);
    }
}
