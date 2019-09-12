package com.client;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;

import com.beans.Employee;
//import com.beans.Student;
import com.dao.*;

public class Client {
	public static void main(String[] args) {
//		Student student1=new Student("C", "D", 10);
//		Student student2=new Student("Nhil", "Sigh", 10);
		
//		Configuration config=new Configuration();
//		config.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory=config.buildSessionFactory();
//		Session session=sessionFactory.openSession();
//		Transaction tx=session.beginTransaction();
//		
//		session.save(student1);
//		session.save(student2);
		
//		System.out.println("Saved");
//		tx.commit();
//		System.out.println("Committed");
//		session.close();
//		sessionFactory.close();
		
		EmployeeDao emp=new EmployeeDaoImpl();
		//emp.addEmployee(new Employee("Craig","Dsouza",50000));
		//emp.updateEmployee(1, 2000000);
		System.out.println(emp.listEmployee());
		//emp.deleteEmployee(2); 
		emp.closeConnection();
	}
}
