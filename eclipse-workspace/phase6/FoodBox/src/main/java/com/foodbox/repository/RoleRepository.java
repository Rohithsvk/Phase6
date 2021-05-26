package com.foodbox.repository;

import org.springframework.data.repository.CrudRepository;

import com.foodbox.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}

