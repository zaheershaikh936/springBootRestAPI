package com.springDemo.springDemo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.springDemo.springDemo.model.Course;
import com.springDemo.springDemo.repository.CourseRepository;

public class CourseServices implements ICourse {
	@Autowired
	private CourseRepository courseRepository;
	
	public Course create(Course courseBody) {
		return courseRepository.save(courseBody)
	}
}
