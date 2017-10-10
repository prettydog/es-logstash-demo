package com.example.demo.service;

import com.example.demo.model.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Created by gaozhen on 2017/10/10.
 */
public interface JobService {

    Job save(Job book);

    void delete(Job book);

    Job findOne(String id);

    Iterable<Job> findAll();
}
