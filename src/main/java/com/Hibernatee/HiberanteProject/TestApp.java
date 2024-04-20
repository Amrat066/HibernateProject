package com.Hibernatee.HiberanteProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        try {
            Employee e = new Employee();
            e.setName("satish");
            e.setAge(12);
            e.setAddress("surat");
            session.save(e);
            System.out.println("data is inserted");
            t.commit();
            
        } catch (Exception e) {
            t.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}