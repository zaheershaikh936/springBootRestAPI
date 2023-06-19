package com.springDemo.springDemo.services;

import java.util.List;

import com.springDemo.springDemo.model.User;

public interface IUser {

	public User create(User userBody);
	public List<User> getAll();
	public User update(User userBody ,int id);
	public User findOne(int id);
}
