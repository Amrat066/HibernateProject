package com.Hibernatee.HiberanteProject;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Display {
	
	public static void main(String args[]) {
		
		    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		    Session session = sessionFactory.openSession();
		    try {
		        List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();
		        for (Employee employee : employees) {
		            System.out.println("ID: " + employee.getId() +
		                               ", Name: " + employee.getName() +
		                               ", Age: " + employee.getAge() +
		                               ", Address: " + employee.getAddress());
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        session.close();
		        sessionFactory.close();
		    }
		
	}

}
