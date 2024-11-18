package com.example.StudentConsumer.controller;

import com.example.StudentConsumer.service.StudentConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    StudentConsumer studentConsumer;
    @GetMapping("/sendTo")
    public void produceMsg(@RequestParam String msg2){
        studentConsumer.sendMessage(msg2);

    }
}
