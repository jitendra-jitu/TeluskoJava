package com.jitu.SpringWebProject;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @ModelAttribute("course")
    public String course (){
        return  "java";
    }

    @RequestMapping("/")
    public String home(){
        return  "index";
    }



//1
/////
//    @RequestMapping("addalien")
//    public String addalien(@ModelAttribute("alien1") Alien alien){
//        return "result";
//    }

//2
/////
    @RequestMapping("addalien")
    public String addalien(Alien alien){
        return "result";
    }


//3
//////
//    @RequestMapping("addalien")
//    public String addalien(@ModelAttribute Alien alien){
//        return "result";
//    }
}



