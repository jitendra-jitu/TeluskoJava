package com.jitu.quizService.feign;


import com.jitu.quizService.model.QuestionWrapper;
import com.jitu.quizService.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {

    @GetMapping("/create")
    public ResponseEntity<List<Integer>> createQuestions(@RequestParam String category, @RequestParam int numberOfQuestions) ;

    @PostMapping("/getquestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsfromIDS(@RequestBody List<Integer> questionIds) ;

    @PostMapping("/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses) ;


}
