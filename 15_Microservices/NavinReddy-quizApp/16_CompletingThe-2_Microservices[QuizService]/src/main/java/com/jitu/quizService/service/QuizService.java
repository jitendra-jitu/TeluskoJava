package com.jitu.quizService.service;


import com.jitu.quizService.dao.QuizDao;
import com.jitu.quizService.feign.QuizInterface;
import com.jitu.quizService.model.Question;
import com.jitu.quizService.model.QuestionWrapper;
import com.jitu.quizService.model.Quiz;
import com.jitu.quizService.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {


    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;

    public ResponseEntity<String> getQuizQuestions(String category, int numberOfQuestions, String title) {


        List<Integer> questionIds = quizInterface.createQuestions(category, numberOfQuestions,title).getBody();

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setCategory(category);
        quiz.setQuestionids(questionIds);
        quizDao.save(quiz);

        return new ResponseEntity<>("Quiz created with ID: " + quiz.getId(), HttpStatus.CREATED);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestionsById(Integer id) {

          Quiz quiz= quizDao.findById(id).get();
          List<Integer> questionIds = quiz.getQuestionids();

          return quizInterface.getQuestionsfromIDS(questionIds);

    }

    public ResponseEntity<Integer> submitQuiz(Integer id, List<Response> responses) {
        return quizInterface.getScore(responses);
    }
}



// RESPONSE BODY -
// ---------------->

// This is the response body for the submitQuiz method in QuizService.
//
//[
//        {
//        "id":61,
//        "response":"Structured Query Language"
//        },
//        {
//        "id":53,
//        "response":"Sun Microsystems"
//        },
//        {
//        "id":54,
//        "response":"HyperText Transfer Protocol"
//        }
//        ]
