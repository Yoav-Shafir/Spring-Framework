package com.springframework.springframework.controllers;

import com.springframework.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Constructor injection example.
@Controller
public class ConstructorInjectionController {

    private GreetingService greetingService;

    // No need for @Autowired when we do Constructor injection.
    // Still, its a good practice to express our intent.
    @Autowired
    public ConstructorInjectionController (@Qualifier("greetingServiceImpl")  GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

// The @Qualifier is only needed when we have more than 1 implementation of the GreetingService interface,
// this is how we tell spring which implementation to inject.
