package com.aprendiendo.oauth2example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain defaultfiChain(HttpSecurity hp) throws Exception
    {
        hp
            .authorizeHttpRequests((requests) -> requests
                .anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());

        return hp.build();
    }
    
}
