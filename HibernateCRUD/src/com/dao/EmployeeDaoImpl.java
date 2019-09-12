package com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private SessionFactory sessionFactory ;

	public EmployeeDaoImpl() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}

	@Override
	public Integer addEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer employeeID = null;

		try {
			tx = session.beginTransaction();
			employeeID = (Integer) session.save(employee); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return employeeID;
	}

	@Override
	public List<Employee> listEmployees() {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<Employee> employees = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM Employee");
			employees=query.list(); 
			
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return employees;
	}

	@Override
	public void updateEmployee(Integer EmployeeID, int salary) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
			employee.setSalary( salary );
			session.update(employee); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
	}

	@Override
	public void deleteEmployee(Integer EmployeeID) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
			session.delete(employee); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
	}
	
	public List<String> getEmployeeNames() {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<String> results = null;
		try {
			tx = session.beginTransaction();
			String hql = "SELECT E.firstName FROM Employee E";
			Query query = session.createQuery(hql);
			results = query.list();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return results;
	}
}




