package com.springDemo.springDemo.services;

import java.util.List;

import com.springDemo.springDemo.model.Course;

public interface ICourse {
	public Course create(Course courseBody);
	public List<Course> findAll();
}
