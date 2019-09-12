package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.beans.Question;

public class FetchData {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		Query query = session.createQuery("from Question");
		List<Question> questions = query.list();
		for (Question question : questions) {
			System.out.println(question);
		}
		tx.commit();    
		session.close();    
		System.out.println("success");    
	}
}
