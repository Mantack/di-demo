package com.example.didemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
public class GreetingServiceImpl implements GreetingService {


    public static final String HELLO_GURUS ="Hello Gurus!!!" ;

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
