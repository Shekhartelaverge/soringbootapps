package com.example.RestCrud.service;


//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;
//import java.util.Optional;

import com.example.RestCrud.entities.Course;
import com.example.RestCrud.repository.MongoRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Services {
	
	@Autowired
	private MongoRepo mongoRepo;
	

	//get
	@Override
	public List<Course> getAll() {
		return mongoRepo.findAll();
	}


    //post
	@Override
	public Course add(Course course) {
		return mongoRepo.insert(course);
		
	}

	//put
	@Override
	public Course update(Course course) {
		
		return mongoRepo.save(course);
	}


	@Override
	public void delete(String courseId) {
		// TODO Auto-generated method stub
		mongoRepo.deleteById(courseId);
		
	}


	
}
