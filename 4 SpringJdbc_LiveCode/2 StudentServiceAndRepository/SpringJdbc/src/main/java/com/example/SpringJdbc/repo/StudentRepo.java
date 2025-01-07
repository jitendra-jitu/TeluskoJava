package com.example.SpringJdbc.repo;

import com.example.SpringJdbc.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("added");
    }

    public List<Student> findAll() {

        List<Student> l=new ArrayList<>();
        return l;
    }
}
