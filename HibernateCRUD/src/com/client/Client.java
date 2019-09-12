package com.client;

import java.util.List;

import com.beans.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class Client {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Ram", "Sharma", 25000);
		Employee employee2 = new Employee("Sham", "Verma", 30000);
		Employee employee3 = new Employee("Seeta", "Lodha", 30000);
		Employee employee4 = new Employee("Geeta", "Sinha", 40000);
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		System.out.println("Emp id: " + employeeDao.addEmployee(employee1));
		System.out.println("Emp id: " + employeeDao.addEmployee(employee2));
		System.out.println("Emp id: " + employeeDao.addEmployee(employee3));
		System.out.println("Emp id: " + employeeDao.addEmployee(employee4));
		
		List<Employee> employees = employeeDao.listEmployees();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		employeeDao.updateEmployee(3, 35000);
		
		employeeDao.deleteEmployee(2);
		
		employees = employeeDao.listEmployees();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}
}
