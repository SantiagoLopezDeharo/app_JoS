package com.aprendiendo.quizapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aprendiendo.quizapp.models.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
    
}
