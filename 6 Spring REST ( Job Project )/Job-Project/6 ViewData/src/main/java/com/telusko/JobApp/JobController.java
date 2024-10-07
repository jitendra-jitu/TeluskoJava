package com.telusko.JobApp;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    public JobService jobService;

//    @RequestMapping({"/","home"})
    @GetMapping({"/","home"})
    public String Home(){
        System.out.println("HomeMethod Called!!");
        return "home";
    }



//    @RequestMapping("addjob")
    @GetMapping("addjob")
    public String addjob(){
        System.out.println("HomeMethod Called!!");
        return "addjob";
    }


//    @RequestMapping(value = "handleForm",method = RequestMethod.POST)
    @PostMapping("handleForm")
    public  String handleform(JobPost jobPost){
        jobService.addjob(jobPost);
        return "success";
    }


    @GetMapping("viewalljobs")
    public String viewdata(Model model){
        List<JobPost> allJobs=jobService.getAllJobs();
        model.addAttribute("jobPosts",allJobs);
        return "viewalljobs";
    }


}
