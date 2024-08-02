package com.example.SpringJdbc;

import com.example.SpringJdbc.Service.StudentService;
import com.example.SpringJdbc.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext content = SpringApplication.run(SpringJdbcApplication.class, args);
		Student s=content.getBean(Student.class);
		s.setRollNo(104);
		s.setMarks(100);
		s.setName("Jitu");

		StudentService s2=content.getBean(StudentService.class);
		s2.addStudent(s);
		List<Student> l=s2.getStudents();
		System.out.println(l);
	}

}
