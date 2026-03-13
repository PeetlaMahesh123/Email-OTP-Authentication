package com.kodnest.learn.services;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kodnest.learn.entities.User;
import com.kodnest.learn.entities.UserOtp;
import com.kodnest.learn.repositories.UserOTPRepository;
import com.kodnest.learn.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserOTPRepository userOtpRepo;
	
	@Autowired
	JavaMailSender mailSender;
	
	public void register(User user) {
		userRepo.save(user);
	}
	
	public boolean loginAndGenerateOTP(String emailId, String password) {
		User user = userRepo.findByEmailId(emailId);
		if(user == null) {
			return false;
		}
		
		if(!user.getPassword().equals(password)) {
			return false;
		}
		
		int otpNum = new Random().nextInt(100000,1000000);
		String otp = String.valueOf(otpNum);
		
		UserOtp userOtp = new UserOtp();
		userOtp.setOtp(otp);
		userOtp.setUserId(user.getId());
		userOtp.setCreatedTime(LocalDateTime.now());
		userOtpRepo.save(userOtp);
		
		
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(user.getEmailId());
		message.setSubject("Your Otp Code");
		message.setText("Hello " + user.getName() + ". Your Otp Code is : " + otp + "This otp is valid for 1 minute");
		mailSender.send(message);
		return true;
	}
	
	public boolean verifyOtp(String otp) {
		UserOtp userOtp = userOtpRepo.findByOtp(otp);
		if(userOtp == null) {
			return false;
		} 
		LocalDateTime expiryTime = userOtp.getCreatedTime().plusMinutes(1);
		if(LocalDateTime.now().isAfter(expiryTime)) { 
			return false;
		}
		return true;
	}
}
