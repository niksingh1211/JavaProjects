package com.client;

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
		
		Address companyAddress = new Address("Xoriant Solutions, Baner", "Pune", "Maharashtra", "India", 12345);
		Employee employee1 = new Employee("Ravi", "Developer");
		
		Employee employee2 = new Employee("Radha", "Developer");
		
		employee1.setAddress(companyAddress);
		employee2.setAddress(companyAddress);
		session.persist(employee1);
		session.persist(employee2);
		
		tx.commit();
		session.close();    
		System.out.println("success");
	}
}
