package com.jitu.SpringRest;

import com.jitu.SpringRest.model.JobPost;
import com.jitu.SpringRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    public JobService jobService;

    @GetMapping("jobPosts")
//    @ResponseBody
    public List<JobPost> getJobPosts(){
        return jobService.getAllJobs();
    }
}
