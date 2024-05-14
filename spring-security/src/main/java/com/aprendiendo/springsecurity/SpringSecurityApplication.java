package com.aprendiendo.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		Dotenv env = Dotenv.configure().load();
		System.setProperty("USR", env.get("USR"));
		System.setProperty("PASS", env.get("PASS"));
		System.out.println(env.get("USR"));
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
