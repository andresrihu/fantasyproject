package com.fantasy.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fantasy.backend.models.User;

public interface UserRepository extends CrudRepository <User, Long> {
	public User findByEmail(String email);
}
