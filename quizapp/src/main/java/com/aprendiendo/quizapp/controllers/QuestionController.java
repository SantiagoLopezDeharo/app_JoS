package com.aprendiendo.quizapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendiendo.quizapp.models.Question;
import com.aprendiendo.quizapp.services.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
    
    @Autowired
    private QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions()
    {
        return questionService.getAllQuestions();
    } 
}
