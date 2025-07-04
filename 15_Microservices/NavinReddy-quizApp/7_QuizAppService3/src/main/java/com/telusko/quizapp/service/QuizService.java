package com.telusko.quizapp.service;

import com.telusko.quizapp.dao.QuestionDao;
import com.telusko.quizapp.dao.QuizDao;
import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.model.QuestionWrapper;
import com.telusko.quizapp.model.Quiz;
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
    QuestionDao questionDao;

    public ResponseEntity<String> getQuizQuestions(String category, int numberOfQuestions, String title) {

        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numberOfQuestions);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setCategory(category);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Quiz created successfully with ID: " + quiz.getId(), HttpStatus.CREATED);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestionsById(Integer id) {

        Optional<Quiz> questionsFromDB= quizDao.findById(id);

        List<Question> quizQuestions=questionsFromDB.get().getQuestions();

        List<QuestionWrapper> queationForUser=new ArrayList<>();
        for(Question question : quizQuestions) {
            QuestionWrapper questionWrapper=new QuestionWrapper(question.getId(),question.getQuestion(),question.getOption1(),question.getOption2(),question.getOption3(),question.getOption4());
            queationForUser.add(questionWrapper);
        }

        return new ResponseEntity<>(queationForUser, HttpStatus.OK);

    }
}
