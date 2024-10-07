package com.jitu.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return  "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelAndView mv){

//        Model         -   model acts as an interface , transfers data b/w Controller and JSP
//        ModelAndView  -



        int result=a+b;
//        model.addAttribute("result",result);

        mv.addObject("result",result);
        mv.setViewName("result");

        System.out.println(result);
        return mv;

    }
}


//        <h2>Result is <%= session.getAttribute("result") %> </h2>
