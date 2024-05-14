package com.aprendiendo.quizapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendiendo.quizapp.models.Question;
import com.aprendiendo.quizapp.repositories.QuestionDao;

@Service
public class QuestionService {

    @Autowired
    QuestionDao qDao;
    
    public List<Question> getAllQuestions() {
        return qDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String categ) {
        return qDao.findByCategory(categ);
    }

    public String addQuestion(Question question) {
        qDao.save(question);
        return "Success";
    }
    
}
