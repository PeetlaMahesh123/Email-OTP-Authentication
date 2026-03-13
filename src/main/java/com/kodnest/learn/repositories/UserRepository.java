package com.kodnest.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.learn.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByEmailId(String emailId);
}
