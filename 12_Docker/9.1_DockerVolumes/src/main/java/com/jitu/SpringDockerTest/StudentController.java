package com.jitu.SpringDockerTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    // Get all students
<<<<<<< HEAD
    @GetMapping("/getstudents")
=======
    @RequestMapping("/getstudents")
>>>>>>> 303c66c0315d6e969c8d9617cb9a4caf7bfa11c5
    public List<Student> allStudents() {
        return studentRepo.findAll();
    }


<<<<<<< HEAD
    @GetMapping("/addstudent")
=======
    @RequestMapping("/addstudent")
>>>>>>> 303c66c0315d6e969c8d9617cb9a4caf7bfa11c5
    public String addStudent() {

        Student student = new Student();
        student.setName("xxxxx");
        student.setRollno(1111);

        studentRepo.save(student);
        return "Student added successfully!";
    }
}

