package com.dao;

import java.util.List;

import com.beans.Employee;

public interface EmployeeDao {
	 public Integer addEmployee(Employee employee);
	 public void updateEmployee(Integer EmployeeID, int salary );
	 public void deleteEmployee(Integer EmployeeID);
	 public List<Employee> listEmployees();
}
