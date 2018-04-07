package com.springframework.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary // This implementation will be primary only if the profile is active which can be set in application.properties
public class PrimarySpanishGreetingServiceImpl implements GreetingService  {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
