package com.jitu.SpringSecurity.service;

import com.jitu.SpringSecurity.dao.UserRepo;
import com.jitu.SpringSecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {

    @Autowired
    private UserRepo repo;

    public void savejob(User user) {

        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        repo.save(user);

    }

}
