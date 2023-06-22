package com.astrotalk.hospital.dto;

//import java.util.Date;

import org.springframework.stereotype.Repository;
@Repository
public class PatientDTO {
	private String name;
	
	private int age;

	private int room;
	
	private String doctor_name;
	
	private String date;
	
	private int expenses;
	
	private String status;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getExpenses() {
		return expenses;
	}

	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public PatientDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientDTO(String name, int age, int room, String doctor_name, String date, int expenses, String status) {
		super();
		this.name = name;
		this.age = age;
		this.room = room;
		this.doctor_name = doctor_name;
		this.date = date;
		this.expenses = expenses;
		this.status = status;
	}
}
