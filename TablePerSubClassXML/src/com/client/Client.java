package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.beans.Contract_Employee;
import com.beans.Employee;
import com.beans.Regular_Employee;

public class Client {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();
		Employee e1=new Employee();    
		e1.setName("Gaurav Chawla");    

		Regular_Employee e2=new Regular_Employee();    
		e2.setName("Vivek Kumar");    
		e2.setSalary(50000);    
		e2.setBonus(5);    

		Contract_Employee e3=new Contract_Employee();    
		e3.setName("Arjun Kumar");    
		e3.setPay_per_hour(1000);    
		e3.setContract_duration("15 hours");    

		session.persist(e1);    
		session.persist(e2);    
		session.persist(e3);    

		tx.commit();    
		session.close();    
		System.out.println("success");    
	}
}
