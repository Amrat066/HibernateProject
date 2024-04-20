package com.HibernateMapping.TablePerSubClass;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	
	public static void main(String args[]) {
		    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        Session session=(Session) sessionFactory.openSession();
	        Transaction t = session.beginTransaction();
	        try {
	        	
	        	
	        	Person p=new Person("amrat","prajapati");
	        	
	        	session.persist(p);
		        	
	        	Emp employee = new Emp("James", "Gosling", "Marketing", new Date());
	    		session.persist(employee);

	    		Owner owner = new Owner("Bill", "Gates", 300L, 20L);
	    		session.persist(owner);
	    		t.commit();
	       
	        }catch(Exception e) {
	        	
	        	t.rollback();
	        	e.printStackTrace();
	        }	
		
	}

}
