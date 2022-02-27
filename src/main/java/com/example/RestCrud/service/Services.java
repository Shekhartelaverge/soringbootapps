package com.example.RestCrud.service;


import java.util.List;

import com.example.RestCrud.entities.Course;

public interface Services {
	
	

	public List<Course> getAll();
//	public Course getById(String courseId);
	public Course add(Course course);
	public Course update(Course course);
	public void  delete(String courseId);

}