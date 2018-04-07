package com.springframework.springframework.controllers;

import com.springframework.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// Field injection example.
@Controller
public class FieldInjectionController {

    // It is possible to inject concrete class,
    // however, the preferable way is to use interfaces.
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
