package com.jitu.SpringDataJPA;

import com.jitu.SpringDataJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {



}
