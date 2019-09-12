package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //class is an entity , written to persist
@Table(name="studentinfo")
public class Student {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int rollNo;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "grade")
	private int grade;
	
	public Student() {}
	
	public Student(String firstname, String lastname, int grade) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.grade = grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
