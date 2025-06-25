package com.jitu.SpringRest;

//package com.jitu.SpringRest.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    // Map the /welcome URL to a method that returns the view name
    @GetMapping("/welcome")
    public String welcome() {
        return "home";  // Returns the "home" view (e.g., home.jsp or home.html)
    }
}

