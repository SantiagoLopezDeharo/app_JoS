package com.aprendiendo.oauth2example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
    @GetMapping("/hello")
    public String hola()
    {
        return "Aprendiendo a usar Oauth2";
    }    
}
