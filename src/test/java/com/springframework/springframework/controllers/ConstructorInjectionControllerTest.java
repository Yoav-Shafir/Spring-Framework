package com.springframework.springframework.controllers;

import com.springframework.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, constructorInjectionController.sayHello());
    }
}
