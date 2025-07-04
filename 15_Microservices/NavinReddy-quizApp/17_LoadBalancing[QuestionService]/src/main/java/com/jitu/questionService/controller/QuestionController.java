package com.jitu.questionService.controller;


import com.jitu.questionService.model.Question;
import com.jitu.questionService.model.QuestionWrapper;
import com.jitu.questionService.model.Response;
import com.jitu.questionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

     @Autowired
     QuestionService questionService;

     @Autowired
     Environment environment;

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

     @GetMapping("/create")
     public ResponseEntity<List<Integer>> createQuestions(@RequestParam String category, @RequestParam int numberOfQuestions,@RequestParam String title) {
          return questionService.createQuestions(category, numberOfQuestions,title);
     }

     @PostMapping("/getquestions")
     public ResponseEntity<List<QuestionWrapper>> getQuestionsfromIDS(@RequestBody List<Integer> questionIds) {
          System.out.println(environment.getProperty("local.server.port"));
          return questionService.getQuestionsfromIDS(questionIds);
     }

     @PostMapping("/getScore")
     public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses) {
          return questionService.getScore(responses);
     }
}


//generate
//getquestion/{quiz-id}
//getscore
//

