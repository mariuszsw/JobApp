package com.mariusz.jobapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @RequestMapping("/home")
    public String homePage() {
        return "home";
    }

    @RequestMapping("/addjob")
    public String addJobPage() {
        return "addjob";
    }

    @RequestMapping("/success")
    public String successPage() {
        return "success";
    }

    @RequestMapping("/viewalljobs")
    public String viewAllJobsPage() {
        return "viewalljobs";
    }
}

