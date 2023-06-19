package com.springDemo.springDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springDemo.springDemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
