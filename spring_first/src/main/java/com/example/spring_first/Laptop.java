package com.example.spring_first;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int i = 0;
    public void compile()
    {
        System.out.println("compiling....  " + String.valueOf(i) );
        i++;
    }

}
