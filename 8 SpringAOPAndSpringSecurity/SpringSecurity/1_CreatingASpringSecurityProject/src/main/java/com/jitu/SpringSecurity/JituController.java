package com.jitu.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JituController {

    @GetMapping("hello")
    public String hello(){
        return "<h1>hello world</h1>";
    }

}
