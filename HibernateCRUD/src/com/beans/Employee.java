package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "salary")
	private int salary;  

	public Employee() {}

	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName( String first_name ) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName( String last_name ) {
		this.lastName = last_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary( int salary ) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
}
