package com.springframework.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en", "default"})
// In case there are more than 1 implementations of the GreetingService interface,
// this Component will be the one Spring picks up when we have the en profile activated
// or no profile at all (default)
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World from PrimaryGreetingService, looks like the en profile is activated or no profile at all (default)";
    }
}
