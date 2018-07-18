package com.example.didemo.controlllers;

import com.example.didemo.services.GreetingService;
import com.example.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
//        return getGreetingService().sayGreeting();
        return greetingService.sayGreeting();
    }
//
//    public GreetingServiceImpl getGreetingService(){
//        return GreetingService;
//    }
}
