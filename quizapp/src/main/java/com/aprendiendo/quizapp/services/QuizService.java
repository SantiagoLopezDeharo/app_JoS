package com.aprendiendo.quizapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.aprendiendo.quizapp.models.Question;
import com.aprendiendo.quizapp.models.Quiz;
import com.aprendiendo.quizapp.repositories.QuestionDao;
import com.aprendiendo.quizapp.repositories.QuizDao;

@Service
public class QuizService {
    @Autowired
    private QuizDao qDao;

    @Autowired
    private QuestionDao queDao;

    public ResponseEntity<String> createQuiz(String category, int numq, String title) {
        List<Question> questions = queDao.findRandomQuestionsByCategory(category, numq);
        
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        qDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
