package com.example.spring_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFirstApplication.class, args);
		System.out.println("Hola Mundo!");
		
		Alien obj = ctx.getBean(Alien.class);
		obj.code();

		Alien obj1 = ctx.getBean(Alien.class);
		obj1.code();
	}

}
