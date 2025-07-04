package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

     @Autowired
     QuestionService questionService;

     @GetMapping("/questions")
     public ResponseEntity<List<Question>> getAllQuestions() {
          return questionService.getAllQuestions();
     }


     @GetMapping("/loadquestions")
     public List<Question> questions() {
          return questionService.loadquestions();
     }

     @GetMapping("/category/{category}")
     public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
            return questionService.getQuestionsByCategory(category);
     }

     @PostMapping("/addquestion")
     public ResponseEntity<List<Question>> addQuestion(@RequestBody Question question) {
          return questionService.addQuestion(question);
     }
}
