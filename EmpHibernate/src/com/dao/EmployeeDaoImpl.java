package com.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Employee;
import com.mysql.cj.Query;

public class EmployeeDaoImpl implements EmployeeDao{

	Session session;
	Transaction tx;
	SessionFactory sessionFactory;
	public EmployeeDaoImpl() {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		sessionFactory=config.buildSessionFactory();
	}
	
	@Override
	public Integer addEmployee(Employee employee) {
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		try {
			employee.setId((Integer)session.save(employee));
			System.out.println(employee.getId());
			tx.commit();
		}
		catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return employee.getId();
	}

	@Override
	public void updateEmployee(Integer id, int salary) {
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		try {
			Employee employee=(Employee) session.get(Employee.class,id);
			employee.setSalary(salary);
			session.update(employee);
			tx.commit();
		}
		catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

	@Override
	public void deleteEmployee(Integer id) {
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		try {
			session.delete((Employee)session.get(Employee.class,id));
			tx.commit();
		}
		catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

	@Override
	public List<Employee> listEmployee() {
		List<Employee> employeeList=null;
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		List<String> results = null;
		try {
			
			String hql = "SELECT E.firstname from Employee E";
			results = session.createQuery(hql).list();
			tx.commit();
			System.out.println(results);
			
		}
		catch (HibernateException e) {
			
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return employeeList;
	}
	
	public void closeConnection() {
		sessionFactory.close();
	}

}
