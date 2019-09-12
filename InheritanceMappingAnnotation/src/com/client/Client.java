package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.*;

public class Client {
	public static void main(String[] args) {
		
		Employee employee = new Employee("Craig");
		Employee employee1 = new Employee("Nikhil");
		
		Regular_Employee regular_Employee = new Regular_Employee(34059, 1000);
		Regular_Employee regular_Employee1 = new Regular_Employee(34059, 2000);
		
		Contract_Employee contract_Employee = new Contract_Employee("6 months", 1000);
		Contract_Employee contract_Employee1 = new Contract_Employee("8 months", 1500);
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(employee);
		session.persist(employee1);
		session.persist(regular_Employee);
		session.persist(regular_Employee1);
		session.persist(contract_Employee);
		session.persist(contract_Employee1);
		System.out.println("Saved");
		tx.commit();
		System.out.println("Commit");
		session.close();
		sessionFactory.close();
	}

}
