package com.example.demo.repository;

import com.example.demo.model.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by gaozhen on 2017/10/10.
 */
public interface JobRepository  extends ElasticsearchRepository<Job, String> {

    Page<Job> findByStatus(String status, Pageable pageable);
}
