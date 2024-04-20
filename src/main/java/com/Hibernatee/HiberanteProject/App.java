package com.Hibernatee.HiberanteProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Course c1 = new Course();
		c1.setTitle("course1");

		Course c2 = new Course();
		c2.setTitle("course2");

		List<Course> Lc2 = new ArrayList<Course>();

		Lc2.add(c1);
		Lc2.add(c2);

		Instructor i = new Instructor();
		i.setFirstname("amrat");
		i.setLastname("prajapati");
		i.setCourse(Lc2);

		Query q = session.createQuery("from Instructor");

		List ldata = q.list();
		System.out.println(ldata);

		
		  q.setMaxResults(1);
		 
		 
			/*
			 * * Query Update=session.
			 * createQuery("update Instructor set firstname:firstname,lastname:lastname where id:id"
			 * ); Update.setParameter("firstname", "aniket");
			 * Update.setParameter("lastname", "dodiya"); Update.setParameter("id","");
			 */
		session.persist(i);
		session.getTransaction().commit();
		session.close();

	}
}
