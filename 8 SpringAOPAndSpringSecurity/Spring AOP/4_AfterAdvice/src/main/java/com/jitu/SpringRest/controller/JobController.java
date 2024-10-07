package com.jitu.SpringRest.controller;

import com.jitu.SpringRest.model.JobPost;
import com.jitu.SpringRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


@RestController
//@CrossOrigin
@CrossOrigin(origins = "http://localhost:3000")
public class JobController implements WebMvcConfigurer {

    @Autowired
    public JobService jobService;

    @GetMapping(path = "jobPosts")
//    @GetMapping(path = "jobPosts",produces = {"application/json","application/xml"})
    public List<JobPost> getJobPosts(){
        return jobService.getAllJobs();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("jobPost/{postid}")
    public JobPost getJob(@PathVariable("postid") int postid){
        return jobService.getjob(postid);
    }



//    @PostMapping(path= "jobPost",consumes = {"application/json","application/xml"})
    @PostMapping(path= "jobPost")
    public JobPost addjob(@RequestBody JobPost jobPost){
        jobService.addjob(jobPost);
        return jobService.getjob(jobPost.getPostId());
    }


    @PutMapping(path = "jobPost",produces = {"application/json","application/xml"}, consumes = {"application/json","application/xml"})
    public JobPost updatejob(@RequestBody JobPost jobPost){
        jobService.updatejob(jobPost);
        return jobService.getjob(jobPost.getPostId());
    }


    @GetMapping(path = "jobPosts/keyword/{keyword}",produces = {"application/json","application/xml"}, consumes = {"application/json","application/xml"})
    public List<JobPost> searchJob(@PathVariable("keyword") String keyword){
        return jobService.search(keyword);

    }

    @DeleteMapping("jobPost/{postid}")
    public String deletejob(@PathVariable int  postid){
        jobService.deletejob(postid);
        return "Deleted!";
    }

    @GetMapping("load")
    public String loadData(){
        jobService.load();
        return "Loaded Data 5 entries Defaultly";
    }


}
