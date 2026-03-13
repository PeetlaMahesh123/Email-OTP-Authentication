package com.kodnest.learn.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserOtp {

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 int otpId;
		 
		 @Column
		 String otp;
		 
		 @Column
		 int userId;
		 
		 @Column
		 LocalDateTime createdTime;
		 
		 public LocalDateTime getCreatedTime() {
			return createdTime;
		}

		 public void setCreatedTime(LocalDateTime createdTime) {
			 this.createdTime = createdTime;
		 }

		 public UserOtp(int otpId, String otp, int userId, LocalDateTime createdTime) {
			super();
			this.otpId = otpId;
			this.otp = otp;
			this.userId = userId;
			this.createdTime = createdTime;
		}

		 public UserOtp() {
			super();
			// TODO Auto-generated constructor stub
		 }

		 public UserOtp(int otpId, String otp, int userId) {
			super();
			this.otpId = otpId;
			this.otp = otp;
			this.userId = userId;
		 }

		 public int getOtpId() {
			 return otpId;
		 }

		 public void setOtpId(int otpId) {
			 this.otpId = otpId;
		 }

		 public String getOtp() {
			 return otp;
		 }

		 public void setOtp(String otp) {
			 this.otp = otp;
		 }

		 public int getUserId() {
			 return userId;
		 }

		 public void setUserId(int userId) {
			 this.userId = userId;
		 }
		 
		 
}
