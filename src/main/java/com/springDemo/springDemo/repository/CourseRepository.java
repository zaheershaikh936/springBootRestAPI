package com.springDemo.springDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDemo.springDemo.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
