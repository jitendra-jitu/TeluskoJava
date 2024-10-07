package com.jitu.SpringRest.service;

import com.jitu.SpringRest.Repo.JobRepo;
import com.jitu.SpringRest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo jobRepo;

    public void addjob(JobPost jobPost){
        jobRepo.addjob(jobPost);

    }

    public List<JobPost> getAllJobs(){

        return jobRepo.getAllJobs();
    }
}
