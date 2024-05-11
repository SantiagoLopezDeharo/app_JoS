package com.aprendiendo.jobapp_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendiendo.jobapp_rest.model.JobPost;
import com.aprendiendo.jobapp_rest.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addjob(JobPost j)
    {
        repo.addjob(j);
    }

    public List<JobPost> getAllJobs()
    {
        return repo.getAllJobs();
    }

    public JobPost getJob(int i) {
        return repo.getJobPost(i);
    }
}
