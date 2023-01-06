package com.younesseb.advproject1.service;


import com.younesseb.advproject1.model.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {
    public Job saveJob(Job job);
    public Optional<Job> getJobById(int jobid);
    public List<Job> getAllJobs();
    Job updateJob(int jobid, Job job);
    void deleteJob(int jobid);
}