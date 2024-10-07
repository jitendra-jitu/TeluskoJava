package com.jitu.SpringDataJPA;

import com.jitu.SpringDataJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);


		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		s1.setRollNo(104);
		s1.setName("jitu");
		s1.setMarks(900);

		s2.setRollNo(105);
		s2.setName("mark");
		s2.setMarks(1000);

		s3.setRollNo(106);
		s3.setName("mark");
		s3.setMarks(700);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);









	}

}
