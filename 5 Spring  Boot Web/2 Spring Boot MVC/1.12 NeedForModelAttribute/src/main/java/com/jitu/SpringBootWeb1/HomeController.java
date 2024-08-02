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

    @RequestMapping("addalien")
    public ModelAndView addalien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){


        Alien alien=new Alien();
        alien.setAid(aid);
        alien.setAname(aname);




        mv.addObject("alien",alien);
        mv.setViewName("result");

        System.out.println(alien);
        return mv;

    }
}



