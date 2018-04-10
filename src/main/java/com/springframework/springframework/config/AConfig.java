package com.springframework.springframework.config;

import com.springframework.springframework.thirdparty.A.A;
import com.springframework.springframework.thirdparty.A.A1;
import com.springframework.springframework.thirdparty.A.A2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This is an example of using the `@ConditionalOnProperty` annotation
// to inject different implementations as Beans.

@Configuration
public class AConfig {

    // Inject this Bean only if this conditional is true,
    // The condition checks if there is some value in `application.properties` for the key `app.somevalue`
    @Bean
    @ConditionalOnProperty("app.somevalue")
    public A a2() {
        return new A2();
    }

    // This is a workaround to inject this Bean if the condition above is false,
    // if we don't even have it in `application.properties`
    @Bean
    @ConditionalOnProperty(name="app.somevalue", havingValue = "bar", matchIfMissing = true)
    public A a1() {
        return new A1();
    }
}
