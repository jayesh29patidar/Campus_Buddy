	package com.campusbuddy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "confirm_password")
	private String cpassword;
	
	@Column(name = "enrollment")
	private String enrollment;
	
	@Column(name = "email")
	private String emailId;
	
	private String branch;
	
	private int sem; 
	private long contact;

	public Student() {
		
	}
	public Student(String firstName, String lastName, String password, String cpassword, String enrollment,
			String emailId, String branch, int sem, long contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.cpassword = cpassword;
		this.enrollment = enrollment;
		this.emailId = emailId;
		this.branch = branch;
		this.sem = sem;
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}



	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}



	public String getEnrollment() {
		return enrollment;
	}



	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
	
	
	
	
}
