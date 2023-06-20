package com.springDemo.springDemo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	public String test() {
		return "Hello from Course";
	}
}
