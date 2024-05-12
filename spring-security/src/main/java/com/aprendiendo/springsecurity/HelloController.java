package com.aprendiendo.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest req)
    {
        return "Hola mundo! " + req.getSession().getId();
    }

    @GetMapping("about")
    public String about()
    {
        return "aprendiendo";
    }
    
}
