package com.telusko.quizapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {


    @GetMapping("/create")
    public ResponseEntity<String> startQuiz(@RequestParam String category,@RequestParam int numberOfQuestions,
                                            @RequestParam String title) {
        return new ResponseEntity<>("Quiz started!", HttpStatus.OK);
    }
}
