package com.jitu.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JituController {

    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "<h1>Home Page</h1>"+request.getSession().getId();
    }



    @GetMapping("hello")
    public String hello(HttpServletRequest request){
        return "<h1>hello world</h1>"+request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "about "+request.getSession().getId();
    }

}
