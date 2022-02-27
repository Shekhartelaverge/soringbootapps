package com.example.RestCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.RestCrud.entities.Course;
import com.example.RestCrud.service.Services;

@RestController
public class Controller {
	
	@Autowired
	private Services service;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome To Course";
	}
	
	// get the data
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.service.getAll();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course get(@PathVariable String courseId) {
		return (Course) this.service.getAll();
		
	}
	@PostMapping("/courses")
	public Course add(@RequestBody Course course) {
		return this.service.add( course);
	}
	
	@PutMapping("/courses")
	public  Course update(@RequestBody Course course) {
		return this.service.update(course);
	}
	
	@DeleteMapping("/courses/{courseId}") 
	public String  delete(@PathVariable String courseId) {
	this.service.delete(courseId);
	return "Deleted with ID : " + courseId;
	}
}
