package com.HibernateMapping.TblPerClassHierchy;

import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        
        
    	      Car c1=new Car();
    	      c1.setName("Mercedes");
    	      c1.setColor("Black");
    	      
    	      Sports_Car c2=new Sports_Car();
    	      c2.setName("Porsche");
    	      c2.setColor("Red");
    	      c2.setMileage(20);
    	      c2.setCost(5000000);
    	      
    	      Taxi_Car c3=new Taxi_Car();
    	      c3.setName("Innova");
    	      c3.setColor("White");
    	      c3.setFarePerKm(7);
    	      c3.setAvailable(true);
    	      
    	      session.persist(c1);
    	      session.persist(c2);
    	      session.persist(c3);
    	      
    	      t.commit();
    	      session.close();
    }
}
