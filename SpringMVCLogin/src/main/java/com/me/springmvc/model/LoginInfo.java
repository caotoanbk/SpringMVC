package com.me.springmvc.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginInfo {
	
	@NotEmpty(message="Email is required!") @Email(message="Not a valid email address!")
	private String email;
	private String password;
	
	public LoginInfo(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}	
	public LoginInfo() {
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	}