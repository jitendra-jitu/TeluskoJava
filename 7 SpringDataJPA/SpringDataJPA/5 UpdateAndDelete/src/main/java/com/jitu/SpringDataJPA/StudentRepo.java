package com.jitu.SpringDataJPA;

import com.jitu.SpringDataJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {

////Query DSL
//    List<Student> findByName(String name);

        @Query("Select s from Student s where s.name=?1")
        List<Student> findByName(String name);

        List<Student> findByMarks(int marks);
        List<Student> findByMarksGreaterThan(int marks);
        List<Student> findByMarksLessThan(int marks);


}


