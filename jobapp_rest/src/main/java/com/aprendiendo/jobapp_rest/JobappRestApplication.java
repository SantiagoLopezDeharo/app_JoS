package com.aprendiendo.jobapp_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class JobappRestApplication {

	public static void main(String[] args) {
		Dotenv env = Dotenv.configure().load();
		System.setProperty("USER", env.get("USER"));
		System.setProperty("PASS", env.get("PASS"));
		SpringApplication.run(JobappRestApplication.class, args);
	}

}
