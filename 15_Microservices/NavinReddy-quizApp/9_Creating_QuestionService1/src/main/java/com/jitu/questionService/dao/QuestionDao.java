package com.jitu.questionService.dao;
import com.jitu.questionService.model.Question;
//import com.telusko.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

    List<Question> findByCategory(String category);

    @Query("SELECT q FROM Question q WHERE q.category = ?1 ORDER BY RANDOM() LIMIT ?2")
    List<Question> findRandomQuestionsByCategory(String category,int numberOfQuestions);
}

