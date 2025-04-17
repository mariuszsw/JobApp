package com.mariusz.jobapp;

import com.mariusz.jobapp.model.JobPost;
import com.mariusz.jobapp.repo.JobRepo;
import com.mariusz.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addJobPage() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobsPage() {
        return "viewalljobs";
    }
}
