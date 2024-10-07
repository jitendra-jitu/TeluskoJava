package com.jitu.SpringRest.service;

import com.jitu.SpringRest.Repo.JobRepo;
import com.jitu.SpringRest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {



    @Autowired
    public JobRepo jobRepo;

    public void addjob(JobPost jobPost){
        jobRepo.save(jobPost);

    }

    public List<JobPost> getAllJobs(){

        return jobRepo.findAll();
    }

    public JobPost getjob(int postid) {

//        String str=null;
//        boolean b=str.equals("gh");

        return jobRepo.findById(postid).orElse(new JobPost());
    }


    public void updatejob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deletejob(int postid) {
        jobRepo.deleteById(postid);
    }

    public void load() {
        List<JobPost> jobs=new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                        List.of("Java", "Javascript", "Python")),
                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")),
                new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                        List.of("Python", "Machine Learning", "Data Analysis")),
                new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                        List.of("Networking", "Cisco", "Routing", "Switching")),
                new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                        3, List.of("iOS Development", "Android Development", "Mobile App"))
        ));

        jobRepo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return jobRepo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
