package com.aprendiendo.jobapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendiendo.jobapp.model.JobPost;
import com.aprendiendo.jobapp.repo.JobRepo;

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
}
