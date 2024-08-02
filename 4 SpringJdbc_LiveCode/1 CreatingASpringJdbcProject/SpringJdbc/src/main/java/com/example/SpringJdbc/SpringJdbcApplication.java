package com.example.SpringJdbc;

import com.example.SpringJdbc.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext content = SpringApplication.run(SpringJdbcApplication.class, args);
		Student s=content.getBean(Student.class);
		s.setMarks(100);
		s.setName("Jitu");

		addStudent(s);
	}

}
