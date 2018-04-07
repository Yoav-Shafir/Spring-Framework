package com.springframework.springframework.controllers;

import com.springframework.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

// This will make it a Spring Component which will be managed
// as a bean with the name of `myController` in the Application Context.
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void hello() {
        System.out.println("<<< Hello >>>");
    }
}
