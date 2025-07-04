package com.telusko.quizapp.service;

import com.telusko.quizapp.Question;
import com.telusko.quizapp.dao.QuestionDao;
 // Corrected name here
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> loadquestions() {
        if (questionDao.count() == 0) {

            Question q1 = new Question();
            q1.setQuestion("What is Java?");
            q1.setOption1("Programming Language");
            q1.setOption2("Car");
            q1.setOption3("Animal");
            q1.setOption4("City");
            q1.setRightanswer("Programming Language");
            q1.setCategory("DEV");
            q1.setDifficultylevel("Easy");
            questionDao.save(q1);

            Question q2 = new Question();
            q2.setQuestion("Which company developed the Java programming language?");
            q2.setOption1("Microsoft");
            q2.setOption2("Sun Microsystems");
            q2.setOption3("Google");
            q2.setOption4("Apple");
            q2.setRightanswer("Sun Microsystems");
            q2.setCategory("IT");
            q2.setDifficultylevel("Easy");
            questionDao.save(q2);

            Question q3 = new Question();
            q3.setQuestion("What does HTTP stand for?");
            q3.setOption1("HyperText Transfer Protocol");
            q3.setOption2("HighText Transfer Protocol");
            q3.setOption3("HyperText Transmission Protocol");
            q3.setOption4("HyperText Transfer Program");
            q3.setRightanswer("HyperText Transfer Protocol");
            q3.setCategory("IT");
            q3.setDifficultylevel("Easy");
            questionDao.save(q3);

            Question q4 = new Question();
            q4.setQuestion("Which data structure uses FIFO order?");
            q4.setOption1("Stack");
            q4.setOption2("Queue");
            q4.setOption3("Array");
            q4.setOption4("Tree");
            q4.setRightanswer("Queue");
            q4.setCategory("DEV");
            q4.setDifficultylevel("Medium");
            questionDao.save(q4);

            Question q5 = new Question();
            q5.setQuestion("What is the time complexity of binary search?");
            q5.setOption1("O(n)");
            q5.setOption2("O(log n)");
            q5.setOption3("O(n log n)");
            q5.setOption4("O(1)");
            q5.setRightanswer("O(log n)");
            q5.setCategory("DEV");
            q5.setDifficultylevel("Medium");
            questionDao.save(q5);

            Question q6 = new Question();
            q6.setQuestion("Which of these is NOT a NoSQL database?");
            q6.setOption1("MongoDB");
            q6.setOption2("Cassandra");
            q6.setOption3("MySQL");
            q6.setOption4("Redis");
            q6.setRightanswer("MySQL");
            q6.setCategory("CLOUD");
            q6.setDifficultylevel("Medium");
            questionDao.save(q6);

            Question q7 = new Question();
            q7.setQuestion("Which keyword is used to create a subclass in Java?");
            q7.setOption1("extends");
            q7.setOption2("implements");
            q7.setOption3("inherits");
            q7.setOption4("super");
            q7.setRightanswer("extends");
            q7.setCategory("DEV");
            q7.setDifficultylevel("Easy");
            questionDao.save(q7);

            Question q8 = new Question();
            q8.setQuestion("In Git, which command is used to upload changes to a remote repository?");
            q8.setOption1("git push");
            q8.setOption2("git pull");
            q8.setOption3("git clone");
            q8.setOption4("git commit");
            q8.setRightanswer("git push");
            q8.setCategory("DEVOPS");
            q8.setDifficultylevel("Easy");
            questionDao.save(q8);

            Question q9 = new Question();
            q9.setQuestion("Which language is primarily used for styling web pages?");
            q9.setOption1("HTML");
            q9.setOption2("JavaScript");
            q9.setOption3("CSS");
            q9.setOption4("Python");
            q9.setRightanswer("CSS");
            q9.setCategory("DEV");
            q9.setDifficultylevel("Easy");
            questionDao.save(q9);

            Question q10 = new Question();
            q10.setQuestion("What does SQL stand for?");
            q10.setOption1("Structured Query Language");
            q10.setOption2("Strong Question Language");
            q10.setOption3("Structured Question Language");
            q10.setOption4("Simple Query Language");
            q10.setRightanswer("Structured Query Language");
            q10.setCategory("IT");
            q10.setDifficultylevel("Easy");
            questionDao.save(q10);
        }
        return questionDao.findAll();
    }



    public List<Question> getQuestionsByCategory(String category) {

//        List<Question> questions = questionDao.findAll();
//        return questions.stream()
//                .filter(question -> question.getCategory().equalsIgnoreCase(category))
//                .toList();


        return questionDao.findByCategory(category);

    }

    public List<Question> addQuestion(Question question) {

        return Collections.singletonList(questionDao.save(question));
//        return questionDao.findAll();
    }
}
