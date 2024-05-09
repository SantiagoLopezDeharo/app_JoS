package com.slincsilver.springjdbcex.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.slincsilver.springjdbcex.model.Student;

@Repository
public class StudentRepo {
    public void save(Student s)
    {
        System.out.println("Added");
    }

    public List<Student> findAll() {
        return new ArrayList<Student>();
    }
}
