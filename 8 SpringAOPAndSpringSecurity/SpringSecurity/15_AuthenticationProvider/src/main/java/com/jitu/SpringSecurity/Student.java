package com.jitu.SpringSecurity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {


    private int id;
    private String name;
    private String technology;

}
