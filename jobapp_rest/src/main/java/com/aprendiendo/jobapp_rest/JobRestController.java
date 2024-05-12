package com.aprendiendo.jobapp_rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aprendiendo.jobapp_rest.model.JobPost;
import com.aprendiendo.jobapp_rest.service.JobService;

@RestController
public class JobRestController {
    
    @Autowired
    private JobService service;
    
    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs()
    {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{i}")
    public JobPost getJob(@PathVariable("i") int i)
    {
        return service.getJob(i);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost)
    {
        service.addjob(jobPost);
    }

    @GetMapping("load")
    public String loadData()
    {
        // Java Developer Job Post
	    service.load();
        return "Exitos";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword)
    {
        return service.search(keyword);
    }
}
