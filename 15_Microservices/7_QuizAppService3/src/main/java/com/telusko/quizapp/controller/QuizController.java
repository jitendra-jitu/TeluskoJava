package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.QuestionWrapper;
import com.telusko.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id) {
        return quizService.getQuizQuestionsById(id);
    }
}
