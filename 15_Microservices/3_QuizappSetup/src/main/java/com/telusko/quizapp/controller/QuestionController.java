package com.telusko.quizapp.controller;

import com.telusko.quizapp.Question;
import com.telusko.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

     @Autowired
     QuestionService questionService;

     @GetMapping("/questions")
     public List<Question> getAllQuestions() {
          return questionService.getAllQuestions();
     }


     @GetMapping("/loadquestions")
     public List<Question> questions() {
          return questionService.loadquestions();
     }

     @GetMapping("/category/{category}")
     public List<Question> getQuestionsByCategory(@PathVariable String category) {
            return questionService.getQuestionsByCategory(category);
     }

     @PostMapping("/addquestion")
     public List<Question> addQuestion(@RequestBody Question question) {
          return questionService.addQuestion(question);
     }
}
