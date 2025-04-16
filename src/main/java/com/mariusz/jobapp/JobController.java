package com.mariusz.jobapp;

import com.mariusz.jobapp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

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
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobsPage() {
        return "viewalljobs";
    }
}
