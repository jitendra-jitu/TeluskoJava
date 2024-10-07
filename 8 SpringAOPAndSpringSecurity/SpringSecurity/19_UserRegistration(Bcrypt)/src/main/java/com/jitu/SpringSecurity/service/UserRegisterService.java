package com.jitu.SpringSecurity.service;

import com.jitu.SpringSecurity.dao.UserRepo;
import com.jitu.SpringSecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {

    @Autowired
    private UserRepo repo;

    public User savejob(User user) {
        repo.save(user);
        return user;
    }
}
