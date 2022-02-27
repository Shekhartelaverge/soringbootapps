package com.example.RestCrud.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course {
	@Id
	private String id;
	private String title;
	private String Description;
	public Course(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		Description = description;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", Description=" + Description + "]";
	}
	

	
}
