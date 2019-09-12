package com.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table; 
@Entity  
@Table(name="emp2201")  
public class Employee_1 {    

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int employeeId;    
	
	private String name,email;    
	
	@ManyToOne(targetEntity=Address_1.class,cascade=CascadeType.ALL)  
	private Address_1 address; 
	
	public Employee_1(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public int getEmployeeId() {  
		return employeeId;  
	}  
	public void setEmployeeId(int employeeId) {  
		this.employeeId = employeeId;  
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
	public Address_1 getAddress() {
		return address;
	}
	public void setAddress(Address_1 address) {
		this.address = address;
	}  
	  

}    