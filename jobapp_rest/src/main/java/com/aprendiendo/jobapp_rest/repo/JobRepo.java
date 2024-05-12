package com.aprendiendo.jobapp_rest.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aprendiendo.jobapp_rest.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>
{
    public List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyboard, String kword);
}
