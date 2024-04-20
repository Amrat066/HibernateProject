package com.HibernatAnnotation.HibernateWithAnnotation;

import org.hibernate.cfg.Configuration;



import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.SessionFactory;

public class App 
{
    public static void main( String[] args )
    {
    
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        try {
        	
        	Employee e=new Employee();
        	e.setName("mukesh");
        	e.setAge(23);
        	e.setAddress("surat");
        	session.save(e);
        	t.commit();
        	System.out.println("the data is inserted");

        }catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
        	t.rollback();
			session.close();
			
		}
        
        
    }
}
