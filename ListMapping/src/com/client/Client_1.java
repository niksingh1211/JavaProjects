package com.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Department;
import com.beans.Employee;


public class Client_1 {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Ramesh"));
		employees.add(new Employee("Suresh"));
		employees.add(new Employee("Ram"));
		employees.add(new Employee("Sham"));
		employees.add(new Employee("Seeta"));
		

		Department department = new Department();
		department.setDept_name("HR");
		department.setEmployees(employees);
		
		session.save(department);
		tx.commit();    
		session.close();    
		System.out.println("success");    
	}
}
