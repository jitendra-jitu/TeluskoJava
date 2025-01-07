package com.example.SpringJdbc.repo;

import com.example.SpringJdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql="insert into student (name,rollNo,marks) values(?,?,?,?)";
        int rows=jdbc.update(sql,s.getName(),s.getRollNo(),s.getMarks());
        System.out.println(rows+"RowsAffected");
    }

    public List<Student> findAll() {
        List<Student> l=new ArrayList<>();
        return  l;
    }
}
