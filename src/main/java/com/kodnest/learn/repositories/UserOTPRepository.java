package com.kodnest.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.learn.entities.UserOtp;

public interface UserOTPRepository extends JpaRepository <UserOtp, Integer>{
	UserOtp findByOtp(String otp);
}
