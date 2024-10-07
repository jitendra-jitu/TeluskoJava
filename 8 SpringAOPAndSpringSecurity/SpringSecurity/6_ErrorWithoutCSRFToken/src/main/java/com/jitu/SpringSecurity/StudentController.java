package com.jitu.SpringSecurity;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    List<Student> students=new ArrayList<>(List.of(
            new Student(1,"Naivn","java"),
            new Student(2,"Jitu","Javascript"),
            new Student(3,"Harsh","python")
    ));


    @GetMapping("students")
    public List<Student> allstudents(){
        return students;
    }


    @GetMapping("student/{studentid}")
    public Student getstudent(@PathVariable int studentid){
        for(Student s:students){
            if(s.getId()==studentid){
                return s;
            }
        }
        return new Student();
    }


    @PostMapping("students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
