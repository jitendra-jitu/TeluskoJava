package com.jitu.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return  "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req){
        int num1= Integer.parseInt(req.getParameter("num1"));
        int num2= Integer.parseInt(req.getParameter("num2"));
        System.out.println(num1+num2);
        return "result.jsp";
    }
}
