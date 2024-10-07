package com.jitu.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return  "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model){

//        model acts as an interface , transfers data b/w Controller and JSP

        int result=a+b;
        model.addAttribute("result",result);

        System.out.println(result);
        return "result";

    }
}


//        <h2>Result is <%= session.getAttribute("result") %> </h2>
