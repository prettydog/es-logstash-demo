package com.example.demo.service;

import com.example.demo.model.Job;
import com.example.demo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Created by gaozhen on 2017/10/10.
 */
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job save(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public void delete(Job job) {
        jobRepository.delete(job);
    }

    @Override
    public Job findOne(String id) {
        return jobRepository.findOne(id);
    }

    public Iterable<Job> findAll() {
        return jobRepository.findAll();
    }

    public Page<Job> findByStatus(String status, PageRequest pageRequest) {
        return jobRepository.findByStatus(status, pageRequest);
    }
}
