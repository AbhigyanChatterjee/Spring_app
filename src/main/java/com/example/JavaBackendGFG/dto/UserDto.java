package com.example.JavaBackendGFG.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	private String name;
	
	private String email;
	
	private long contactNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
}
