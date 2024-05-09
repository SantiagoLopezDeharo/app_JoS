package com.example.spring_first.service;
import springjdbcex.src.main.java.com.slincsilver.springjdbcex.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
    public void addStudent(Student s)
    {
        System.out.println("Student addes");
    }    
}
