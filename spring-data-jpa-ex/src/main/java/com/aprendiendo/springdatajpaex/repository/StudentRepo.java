package com.aprendiendo.springdatajpaex.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aprendiendo.springdatajpaex.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> 
{
    @Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String string);

}
