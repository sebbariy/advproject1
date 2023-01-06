package com.younesseb.advproject1.controller;

import com.younesseb.advproject1.model.Job;
import com.younesseb.advproject1.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/job")
@CrossOrigin("*")
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping("/addJob")
    public String add(@RequestBody Job job){
        jobService.saveJob(job);
        return "New Job is added";
    }

    @GetMapping("/getAllJobs")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("/{jobid}")
    public Optional<Job> getJobById(@PathVariable int jobid){
        return jobService.getJobById(jobid);
    }

    @PutMapping("/{jobid}")
    public Job updateJob(@PathVariable int jobid, @RequestBody Job job){
        return jobService.updateJob(jobid, job);
    }

    @DeleteMapping("/{jobid}")
    public void deleteJob(@PathVariable int jobid){
        jobService.deleteJob(jobid);
    }

}
