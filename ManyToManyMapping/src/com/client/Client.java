package com.client;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.beans.Answer;
import com.beans.Question;

public class Client {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		Session session =  sessionFactory.openSession();

		Transaction tx =  session.beginTransaction();

		Answer ans1=new Answer();  
		ans1.setAnswername("Java is a programming language");  
		ans1.setPostedBy("Ravi Malik");  

		Answer ans2=new Answer();  
		ans2.setAnswername("Java is a platform");  
		ans2.setPostedBy("Sudhir Kumar");  

		Question q1=new Question();  
		q1.setQname("What is Java?");  
		ArrayList<Answer> l1=new ArrayList<Answer>();  
		l1.add(ans1);  
		l1.add(ans2);  
		q1.setAnswers(l1);  

		Answer ans3=new Answer();    
		ans3.setAnswername("Servlet is an Interface");    
		ans3.setPostedBy("Jai Kumar");    

		Answer ans4=new Answer();    
		ans4.setAnswername("Servlet is an API");    
		ans4.setPostedBy("Arun");    

		Question q2=new Question();  
		q2.setQname("What is Servlet?");  
		ArrayList<Answer> l2=new ArrayList<Answer>();  
		l2.add(ans3);  
		l2.add(ans4);  
		q2.setAnswers(l2);  
		session.persist(q1);    
		session.persist(q2);    



		tx.commit();  
		session.close();
		System.out.println("success");    
	}
}
