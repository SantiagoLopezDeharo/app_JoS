package com.aprendiendo.springdatajpaex;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aprendiendo.springdatajpaex.model.Student;
import com.aprendiendo.springdatajpaex.repository.StudentRepo;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SpringDataJpaExApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();
		System.setProperty("USER", dotenv.get("USER"));
		System.setProperty("PASS", dotenv.get("PASS"));
		
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = ctx.getBean(StudentRepo.class);

		Student s1 = ctx.getBean(Student.class);
		Student s2 = ctx.getBean(Student.class);
		Student s3 = ctx.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Navin");
		s1.setMarks(75);

		s2.setRollNo(102);
		s2.setName("Kiran");
		s2.setMarks(80);

		s3.setRollNo(103);
		s3.setName("Harsh");
		s3.setMarks(70);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);

		System.out.println(repo.findAll());

		List<Student> ss = repo.findByName("Navin");
		System.out.println(ss);

		repo.delete(s1);
	}

}
