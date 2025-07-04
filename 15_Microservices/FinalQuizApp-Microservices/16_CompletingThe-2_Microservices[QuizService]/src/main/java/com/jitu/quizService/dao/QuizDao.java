package com.jitu.quizService.dao;

import com.jitu.quizService.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

    // This interface can be extended to include methods specific to quiz operations
    // For example, methods to fetch quizzes by title or other criteria can be added here.
}
