package com.foodbox.repository;

import org.springframework.data.repository.CrudRepository;

import com.foodbox.domain.User;


public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}

