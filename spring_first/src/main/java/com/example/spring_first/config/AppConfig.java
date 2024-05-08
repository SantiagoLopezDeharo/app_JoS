package com.example.spring_first.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.spring_first.Alien;
import com.example.spring_first.Laptop;

@Configuration
@ComponentScan("com.example.spring_first")
public class AppConfig {
    /* 
    @Bean(name = "lap")
    @Primary
    //@Scope("prototype") //creado on demand los objetos
    public Laptop lappp()
    {
        return new Laptop();
    }

    @Bean(name = "alien1")
    public Alien alien(@Qualifier("lap") @Autowired Laptop lap)
    {
        Alien obj = new Alien();
        obj.setLap(lap);
        return obj;
    }

    */

}
