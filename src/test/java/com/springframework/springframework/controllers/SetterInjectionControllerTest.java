package com.springframework.springframework.controllers;

import com.springframework.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, setterInjectionController.sayHello());
    }
}
