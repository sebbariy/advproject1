package com.younesseb.advproject1.service;


import com.younesseb.advproject1.model.Job;
import com.younesseb.advproject1.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Optional<Job> getJobById(int jobid) {
        return jobRepository.findById(jobid);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job updateJob(int jobid, Job job) {
        Job jobToUpdate = jobRepository.findById(jobid).orElseThrow();
        jobToUpdate.setCompanyImg(job.getCompanyImg());
        jobToUpdate.setCompanyname(job.getCompanyname());
        jobToUpdate.setJobname(job.getJobname());
        jobToUpdate.setLink(job.getLink());
        jobToUpdate.setDescription(job.getDescription());
        return jobRepository.save(jobToUpdate);
    }

    @Override
    public void deleteJob(int jobid) {
        jobRepository.deleteById(jobid);
    }
}
