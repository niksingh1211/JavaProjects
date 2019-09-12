package com.beans;

public class Student {
	private int rollNo;
	private String firstname;
	private String lastname;
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
