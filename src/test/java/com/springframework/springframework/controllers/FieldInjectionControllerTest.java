package com.springframework.springframework.controllers;

import com.springframework.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldInjectionControllerTest {

    private FieldInjectionController fieldInjectionController;

    @Before
    public void setUp() throws Exception {
        this.fieldInjectionController = new FieldInjectionController();
        this.fieldInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, fieldInjectionController.sayHello());
    }
}
