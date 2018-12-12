package com.mini.board.dto;

public class UserDto {
	private String id;
	private String password;
	private String name;
	private String phoneNum;
	private String email;
	
	UserDto(){}
	
	UserDto(String id, String password, String name, String phoneNum, String email) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", password=" + password + ", name=" + name + ", phoneNum=" + phoneNum + ", email="
				+ email + "]";
	}
	
}
