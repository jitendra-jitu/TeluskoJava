package com.telusko.JopApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @RequestMapping({"/","home"})
    public String Home(){
        System.out.println("HomeMethod Called!!");
        return "home";
    }


    @RequestMapping("addjob")
    public String addjob(){
        System.out.println("HomeMethod Called!!");
        return "addjob";
    }


}
