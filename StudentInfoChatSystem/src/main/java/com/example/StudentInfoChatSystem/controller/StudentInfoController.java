package com.example.StudentInfoChatSystem.controller;

import com.example.StudentInfoChatSystem.service.StudentService;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoController {
    @Autowired
    StudentService studentService;
    @GetMapping("/send")
    public void produceMsg(@RequestParam String msg){
        studentService.sendMessage(msg);

    }


}
