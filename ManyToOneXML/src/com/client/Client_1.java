package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.beans.Address_1;
import com.beans.Employee_1;

public class Client_1 {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate_1.cfg.xml");
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();
		
		Address_1 companyAddress = new Address_1("Xoriant Solutions, Baner", "Pune", "Maharashtra", "India", 12345);
		Employee_1 employee1 = new Employee_1("Ravi", "ravi@xoriant.com");
		
		Employee_1 employee2 = new Employee_1("Radha", "radha@xoriant.com");
		
		employee1.setAddress(companyAddress);
		employee2.setAddress(companyAddress);
		session.persist(employee1);
		session.persist(employee2);
		
		tx.commit();
		session.close();    
		System.out.println("success");
	}
}
