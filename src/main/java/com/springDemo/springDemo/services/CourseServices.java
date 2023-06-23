package com.springDemo.springDemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springDemo.springDemo.model.Course;
import com.springDemo.springDemo.repository.CourseRepository;

@Service
public class CourseServices implements ICourse {
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course create(Course courseBody) {
		return courseRepository.save(courseBody);
	}
	
	@Override
	public List<Course> findAll(){
		return courseRepository.findAll();
	}
}
