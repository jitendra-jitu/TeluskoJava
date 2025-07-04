package com.jitu.quizService.controller;

import com.jitu.quizService.model.QuestionWrapper;
import com.jitu.quizService.model.Response;
import com.jitu.quizService.service.QuizService;

import org.springframework.beans.factory.annotation.Autowired;
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


    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response
            > responses) {
        return quizService.submitQuiz(id, responses);
    }
}
