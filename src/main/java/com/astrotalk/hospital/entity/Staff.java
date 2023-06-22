package com.astrotalk.hospital.entity;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.transaction.Transactional;
@Entity
@Transactional
@Table(name="Staff",uniqueConstraints={@UniqueConstraint(columnNames={"username"})})
public class Staff {
	
	@Override
	public String toString() {
		return "Staff [name=" + name + ", id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	@Column(name="staff_name")
	@NotEmpty(message="Name cannot be empty")
	@Size(min=3,max=20,message="Name should have atleast 3 and atmost 15 characters")
	private String name;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Column(name="username",unique=true)
	@NotEmpty(message="Usermame cannot be empty")
	@Size(min=5,max=20,message="Userame should have atleast 5 and atmost 15 characters")
	private String username;
	
	@NotEmpty(message="Password cannot be empty")
	@Size(min=6,max=20,message="Password should have atleast 6 and atmost 15 characters")
	@Column(name="password")
	private String password;
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserame() {
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
	
	public Staff(@NotEmpty(message="Name cannot be empty")String name, 
	@NotEmpty(message="Username cannot be empty")String username, 
	@NotEmpty(message="Password cannot be empty")String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}

}
