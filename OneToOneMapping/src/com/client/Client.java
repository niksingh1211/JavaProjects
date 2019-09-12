package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.beans.Address;
import com.beans.Employee;

public class Client {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();
		
		Address address = new Address("MG Road,Camp", "Pune", "Maharashtra", "India", 12345);
		Employee employee = new Employee("Ravi", "Develpoer");
		
		address.setEmployee(employee);
		employee.setAddress(address);
		
		session.persist(employee);
		tx.commit();    
		
		Query query= session.createQuery("from Employee") ;
		List<Employee> list=query.list();  
	        
		for (Employee employee2 : list) {
			System.out.println(employee2);
		}
		session.close();    
		System.out.println("success");
	}
}
