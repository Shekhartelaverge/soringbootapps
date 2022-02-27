package com.example.RestCrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.RestCrud.entities.Course;

@Repository
public interface MongoRepo extends MongoRepository<Course, String >{

}
