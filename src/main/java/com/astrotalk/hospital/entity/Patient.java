package com.astrotalk.hospital.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
@Transactional
@Table(name="Patients",uniqueConstraints={@UniqueConstraint(columnNames={"room_no"})})
public class Patient {
	
	@NotEmpty(message="Name cannot be empty")
	@Size(min=3,max=20,message="Name should have atleast 3 and atmost 15 characters")
	@Column(name="patient_name")
	private String name;
	

	@NotNull
	@Column(name="patient_age")
	@Min(value=1,message="Age should be greater than 0")
	@Max(value=1000,message="Age should be less than 101")
	private int age;
	
	@Id
	@NotNull
	@Column(name="room_no")
	@Min(value=1,message="Room number should be greater than 0")
	@Max(value=1000,message="Room number should be less than 1000")
	private int room;
	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", room=" + room + ", doctor_name=" + doctor_name + ", date="
				+ date + ", expenses=" + expenses + ", status=" + status + "]";
	}
	@NotEmpty(message="Doctor Name cannot be empty")
	@Size(min=3,max=20,message="Name should have atleast 3 and atmost 15 characters")
	@Column(name="doctor_name")
	private String doctor_name;
	
	@NotEmpty(message="Date cannot be empty")
	@Column(name="date")
	private String date;
	
	@NotNull
	@Min(value=100, message="Value cannnot be less than 100")
	@Max(value=1000000, message="Value cannnot exceed 1000000")
	@Column(name="expenses")
	private int expenses;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private Status status;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Patient(String name, int age, int room, String doctor_name, String date, int expenses,Status status) {
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
