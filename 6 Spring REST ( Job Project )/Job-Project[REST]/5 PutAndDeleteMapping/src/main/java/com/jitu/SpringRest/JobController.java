package com.jitu.SpringRest;

import com.jitu.SpringRest.model.JobPost;
import com.jitu.SpringRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    public JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getJobPosts(){
        return jobService.getAllJobs();
    }


    @GetMapping("jobPosts/{postid}")
    public JobPost getJob(@PathVariable("postid") int postid){
        return jobService.getjob(postid);
    }



    @PostMapping("jobPost")
    public JobPost addjob(@RequestBody JobPost jobPost){
        jobService.addjob(jobPost);
        return jobService.getjob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updatejob(@RequestBody JobPost jobPost){
        jobService.updatejob(jobPost);
        return jobService.getjob(jobPost.getPostId());
    }


    @DeleteMapping("jobPost/{postid}")
    public String deletejob(@PathVariable int  postid){
        jobService.deletejob(postid);
        return "Deleted!";
    }


}