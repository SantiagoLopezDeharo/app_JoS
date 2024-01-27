package com.platzi.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Math;

@RestController
public class esprimo 
{
	@GetMapping("/{value}")
	public String index(@PathVariable String value) 
    {
        int n = Integer.valueOf(value);

        boolean prime = true;
        if (n == 2) return "Es primo";
        if ( n % 2 == 0 ) return "No es primo: 2";
        int i = 3;
        while( prime && ( i < Math.sqrt(n)+1 ) )
        {
            prime = prime && (n%i == 0);
            i += 2;
        }

		if (prime) return "Es primo";
        return "No es primo: " + String.valueOf(i-2);
	}
}