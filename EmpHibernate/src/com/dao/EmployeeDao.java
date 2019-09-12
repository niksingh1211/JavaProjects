package com.dao;

import java.util.List;

import com.beans.Employee;

public interface EmployeeDao {
	public Integer addEmployee(Employee employee);
	public void updateEmployee(Integer id,int salary);
	public void deleteEmployee(Integer id);
	public List<Employee> listEmployee();
	public void closeConnection();
}
