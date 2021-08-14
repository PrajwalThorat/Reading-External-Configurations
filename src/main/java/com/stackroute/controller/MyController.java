package com.stackroute.controller;


import com.stackroute.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyController {
    @Autowired
    private MyService myService;


    @GetMapping("msg1")
    public String getMessageUsingValue(){
        return myService.generateMessageUsingValue();
    }

    @GetMapping("msg2")
    public String getMessageUsingEnvironment(){
        return myService.generateMessageUsingEnvironment();
    }
}
