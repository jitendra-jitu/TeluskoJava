package com.jitu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthController {

    @GetMapping("/hello")
    public String hello(){
        return "Welcome to Oauth-config...";
    }

}
