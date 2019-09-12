package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.beans.Contract_Employee;
import com.beans.Employee;
import com.beans.Regular_Employee;

public class FetchData {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();
		
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		tx.commit();    
		session.close();    
		System.out.println("success");    
	}
}
