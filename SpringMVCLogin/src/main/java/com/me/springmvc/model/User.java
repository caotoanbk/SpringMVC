package com.me.springmvc.model;

public class User {
	private Long id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String birthday;
	private String education;
	
	
	public User(Long id, String first_name, String last_name, String email, String gender, String birthday,
			String education) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.education = education;
	}
	public User() {
		this.id =0L;
		this.first_name="";
		this.last_name="";
		this.email="";
		this.gender="";
		this.birthday="";
		this.education="";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	

}
