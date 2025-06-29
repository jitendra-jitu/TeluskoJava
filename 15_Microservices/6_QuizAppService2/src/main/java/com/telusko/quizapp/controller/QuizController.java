package com.telusko.quizapp.controller;

import com.telusko.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @GetMapping("/create")
    public ResponseEntity<String> startQuiz(@RequestParam String category,@RequestParam int numberOfQuestions,
                                            @RequestParam String title) {
        return quizService.getQuizQuestions(category, numberOfQuestions, title);
    }
}
