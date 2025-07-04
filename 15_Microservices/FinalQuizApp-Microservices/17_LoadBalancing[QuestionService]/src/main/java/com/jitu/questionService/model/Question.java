package com.jitu.questionService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightanswer;
    private String category;
    private String difficultylevel;



    public Question(String question, String option1, String option2, String option3, String option4,
                    String rightanswer, String category, String difficultylevel) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.rightanswer = rightanswer;
        this.category = category;
        this.difficultylevel = difficultylevel;
    }



}
