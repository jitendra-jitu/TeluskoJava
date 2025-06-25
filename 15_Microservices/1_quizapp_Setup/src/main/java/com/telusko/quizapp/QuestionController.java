package com.telusko.quizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {


     @GetMapping("/questions")
     public String getAllQuestions() {
         return "Here are all the questions";
     }


}
