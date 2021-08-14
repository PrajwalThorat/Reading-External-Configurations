package com.stackroute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private Environment evm;

    @Value("${com.stackroute.message1}")
    private String msg1;

    public String generateMessageUsingValue(){
        return msg1;
    }

    public String generateMessageUsingEnvironment(){
        String keyValue = evm.getProperty("com.stackroute.message2");
        return keyValue;
    }
}
