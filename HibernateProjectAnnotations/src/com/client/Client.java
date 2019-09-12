package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Student;

public class Client {
	public static void main(String[] args) {
		Student student1 = new Student("Ram", "Verma", 6);
		Student student2 = new Student("Shyam", "Verma", 6);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =  configuration.buildSessionFactory();


		Session session =  sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		session.save(student1);
		session.save(student2);
		System.out.println("saved");
		tx.commit();
		System.out.println("commit");
		session.close();
		sessionFactory.close();

	}
}
