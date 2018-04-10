package com.springframework.springframework.config;

import com.springframework.springframework.thirdparty.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This is how we make a third party class to be a managed bean in our Application Context
@Configuration
public class PersonConfig {

    @Bean
    public Person person() {
        return new Person();
    }
}
