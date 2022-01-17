package com.luanrlima.calcmedesafio.DTO;

import java.io.Serializable;

import com.luanrlima.calcmedesafio.domain.User;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	private String phone;
	
	public UserDTO() {
	}

	public UserDTO(String id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public UserDTO(User u) {
		this.id = u.getId();
		this.name = u.getName();
		this.email = u.getEmail();
		this.phone = u.getPhone();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
