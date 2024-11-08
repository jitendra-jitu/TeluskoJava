package com.jitu.SpringDockerTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    // Get all students
    @GetMapping("/getstudents")
    public List<Student> allStudents() {
        return studentRepo.findAll();
    }


    @GetMapping("/addstudent")
    public String addStudent() {

        Student student = new Student();
        student.setName("xxxxx");
        student.setRollno(1111);

        studentRepo.save(student);
        return "Student added successfully!";
    }
}

