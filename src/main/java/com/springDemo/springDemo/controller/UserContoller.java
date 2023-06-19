package com.springDemo.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springDemo.springDemo.model.User;
import com.springDemo.springDemo.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserContoller {

	@Autowired 
	 private UserServices userServices;
	
	@GetMapping()
	public List<User>getAll() {
		return userServices.getAll();
	}
	
	@GetMapping("/{id}")
	public User findOne(@PathVariable("id") int id) {
		return userServices.findOne(id);
	}
	
	@PostMapping
	public User create(@RequestBody User userBody) {
		return userServices.create(userBody);
	}
	
	@PutMapping("/{id}")
	public User udpate(@PathVariable("id") int id, @RequestBody User userBody) {
		return userServices.update(userBody, id);
	}
}
