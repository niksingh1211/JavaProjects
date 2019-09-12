package com.beans;

public class Employee {
	private int employeeId;  
	private String name;
	private String designation;  
	private Address address;  
	
	public Employee() {}
	
	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", designation=" + designation + ", address="
				+ address.toString() + "]";
	}
	
	
	
}
