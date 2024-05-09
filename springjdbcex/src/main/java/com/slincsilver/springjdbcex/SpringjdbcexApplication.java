package com.slincsilver.springjdbcex;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.slincsilver.springjdbcex.model.Student;
import com.slincsilver.springjdbcex.service.StudentService;

@SpringBootApplication
public class SpringjdbcexApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(SpringjdbcexApplication.class, args);
		Student s = ctx.getBean(Student.class);

		s.setRollNo(101);
		s.setName("Navin");
		s.setMarks(78);

		StudentService service = ctx.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
