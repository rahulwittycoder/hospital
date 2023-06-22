package com.astrotalk.hospital.dto;

//import java.util.Date;

import org.springframework.stereotype.Repository;
@Repository
public class StaffDTO {

	private String name;
	
	private int id;
	
	private String username;
	
	private String password;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public StaffDTO(String name, int id, String username, String password) {
		super();
		this.name = name;
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public StaffDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}