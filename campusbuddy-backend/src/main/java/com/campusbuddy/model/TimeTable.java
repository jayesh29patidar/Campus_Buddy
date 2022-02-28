package com.campusbuddy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TimeTable {

	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String subject;
	 
	 @Column(name = "professor_name")
	 private String professor;
	 
	 @Column(name = "lecture_timing")
	 private String lecTiming;
	 
	 private String hallNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getLecTiming() {
		return lecTiming;
	}

	public void setLecTiming(String lecTiming) {
		this.lecTiming = lecTiming;
	}

	public String getHallNumber() {
		return hallNumber;
	}

	public void setHallNumber(String hallNumber) {
		this.hallNumber = hallNumber;
	}

	 
}
