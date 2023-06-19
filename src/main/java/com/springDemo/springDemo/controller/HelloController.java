package com.springDemo.springDemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@GetMapping()
	private String test() {
		return "HELLO .... from server look's all good here api's running successfully.";
	}
}
