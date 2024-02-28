package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Job;
import com.example.demo.repository.JobRepo;
@Service
public class JobService
{
    private final JobRepo jobRepo;
    @Autowired
    JobRepo repo;
    private JobService(JobRepo jobRepo)
    {
        this.jobRepo=jobRepo;
    }
   @SuppressWarnings("null")
public Job createJob(Job job)
   {
        return jobRepo.save(job);
   }
   public List<Job> getAllJobs()
   {
    return jobRepo.findAll();
   }
   public Job getJobId(int jobId)
   {
    return jobRepo.findById(jobId).orElse(null);
   }
}