package com.example.didemo.controlllers;

import com.example.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
