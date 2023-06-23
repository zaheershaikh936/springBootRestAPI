package com.springDemo.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springDemo.springDemo.model.Course;
import com.springDemo.springDemo.services.CourseServices;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseServices courseServices;
	
	@PostMapping()
	public Course create(@RequestBody Course courseData) {
		return courseServices.create(courseData);
	}
	
	@GetMapping()
	public List<Course> findAll(){
		return courseServices.findAll();
	}
	
}
