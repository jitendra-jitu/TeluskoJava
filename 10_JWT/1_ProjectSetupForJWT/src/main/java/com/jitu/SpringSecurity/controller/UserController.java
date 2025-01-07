package com.jitu.SpringSecurity.controller;


import com.jitu.SpringSecurity.model.User;
import com.jitu.SpringSecurity.service.UserRegisterService;
import com.jitu.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRegisterService userRegisterService;

    @PostMapping("register")
    public User register(@RequestBody User user){

        userRegisterService.savejob(user);
        return user;
    }
}
