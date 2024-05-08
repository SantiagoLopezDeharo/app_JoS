package com.example.spring_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_first.config.AppConfig;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
		/*
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Hola Mundo!");
		
		Alien obj = (Alien) ctx.getBean("alien1");
		obj.code();

		Alien obj1 = (Alien) ctx.getBean("alien1");
		obj1.code();

		Laptop lap = (Laptop) ctx.getBean("lap");
		lap.compile();
		*/

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Laptop obj1 = ctx.getBean("lap", Laptop.class);
		obj1.compile();
		Laptop obj2 = ctx.getBean(Laptop.class);
		obj2.compile();
		
		Alien obj = ctx.getBean(Alien.class);
		obj.code();
	}

}
