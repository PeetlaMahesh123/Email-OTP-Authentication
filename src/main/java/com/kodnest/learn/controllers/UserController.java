package com.kodnest.learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodnest.learn.entities.User;
import com.kodnest.learn.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userServ;
	
	@GetMapping("/")
	public String displaySignUpPage() 
	{
		return "index";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user) {
		userServ.register(user);
		System.out.println("success");
		return "login";
	}
	
	@GetMapping("/login")
	public String displayLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String emailId,
	                        @RequestParam String password) {

	    boolean status = userServ.loginAndGenerateOTP(emailId, password);

	    if(status) {
	        return "otp";
	    } else {
	        return "loginfail";
	    }
	}
	
	@PostMapping("/verifyotp")
	public String verifyOTP(@RequestParam String otp) {
		boolean status = userServ.verifyOtp(otp);
		if(status == true) {
			return "homepage";
		} else {
			return "loginfail";
		}
	}
}
