package com.springDemo.springDemo.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springDemo.springDemo.model.User;
import com.springDemo.springDemo.repository.UserRepository;

@Service
public class UserServices implements IUser{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User create(User userBody) {
		return userRepository.save(userBody);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User update(User userBody, int id) {
		User data = userRepository.findById(id).get();
		if(Objects.nonNull(data.getName()) && !"".equalsIgnoreCase(data.getName())) {
			data.setName(userBody.getName());
		}
		if(Objects.nonNull(data.getEmail()) && !"".equalsIgnoreCase(data.getEmail())) {
			data.setEmail(userBody.getEmail());
		}
		
		return userRepository.save(data);
	}

	@SuppressWarnings("deprecation")
	@Override
	public User findOne(int id) {
		System.out.println(id);
		return userRepository.getById(id);
	}
	
}
