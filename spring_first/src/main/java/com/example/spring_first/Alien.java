package com.example.spring_first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    
    @Autowired
    @Qualifier("lap")
    private Laptop lap;

    public Alien()
    {
        System.out.println("Alien creado");
    }

    public void code()
    {
        System.out.println("coding");
        lap.compile();
    }
    

    /**
     * @return Laptop return the lap
     */
    public Laptop getLap() {
        return lap;
    }

    /**
     * @param lap the lap to set
     */
    public void setLap(Laptop lap) {
        this.lap = lap;
    }

}
