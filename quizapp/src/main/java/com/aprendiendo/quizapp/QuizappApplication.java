package com.aprendiendo.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class QuizappApplication {

	public static void main(String[] args) {
		Dotenv env = Dotenv.configure().load();
		System.setProperty("USR", env.get("USR"));
		System.setProperty("PASS", env.get("PASS"));
		SpringApplication.run(QuizappApplication.class, args);
	}

}
