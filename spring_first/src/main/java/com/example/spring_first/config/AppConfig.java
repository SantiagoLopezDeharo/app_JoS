package com.example.spring_first.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.spring_first.Alien;
import com.example.spring_first.Laptop;

@Configuration
public class AppConfig {
    
    @Bean(name = "lap")
    @Scope("prototype") //creado on demand los objetos
    public Laptop lappp()
    {
        return new Laptop();
    }

}
