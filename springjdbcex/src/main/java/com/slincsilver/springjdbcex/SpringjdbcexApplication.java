package com.slincsilver.springjdbcex;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.slincsilver.springjdbcex.model.Student;
import com.slincsilver.springjdbcex.service.StudentService;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SpringjdbcexApplication {

	public static void main(String[] args) 
	{
		Dotenv dotenv = Dotenv.configure().load();
		System.setProperty("USER", dotenv.get("USER"));
    	System.setProperty("PASS", dotenv.get("PASS"));
		ApplicationContext ctx = SpringApplication.run(SpringjdbcexApplication.class, args);
		Student s = ctx.getBean(Student.class);

		s.setRollNo(106);
		s.setName("Navin");
		s.setMarks(78);

		StudentService service = ctx.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
