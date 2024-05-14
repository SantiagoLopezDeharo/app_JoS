package com.aprendiendo.quizapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aprendiendo.quizapp.models.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    
}
