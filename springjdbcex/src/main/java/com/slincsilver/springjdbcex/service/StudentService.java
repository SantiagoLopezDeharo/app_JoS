package com.slincsilver.springjdbcex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slincsilver.springjdbcex.model.Student;
import com.slincsilver.springjdbcex.repo.StudentRepo;

@Service
public class StudentService {

    private StudentRepo repo;

    public void addStudent(Student s)
    {
        repo.save(s);
    }


    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }


    public List<Student> getStudents() {
        return repo.findAll();
    }

}
