package com.example.demo.jobs;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepo extends MongoRepository <job, String> {

}
