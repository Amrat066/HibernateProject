package com.HQLPROJECT.NamedQuery;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class App {
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("HQLconfigure.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		try {
			
			
//			Query q=session.getNamedQuery("findStudentByName");
//			q.setParameter("name","hitesh");
//			List result=q.list();
//			System.out.println(result);
			
			
			
//		  List<Student>s=session.getNamedQuery("findStudentByName").setParameter("name", "amrat").list();
//		  for(Student g:s) {
//			  System.out.println(g);
//		  }
			
			List<Student> m=session.getNamedQuery("findStudent").list();
			for(Student s:m) {
				System.out.println(s);
			}
		
//			Query q=session.getNamedQuery("DeleteById");
//			q.setParameter("id", 4);
//			q.executeUpdate();
//			System.out.println("the data is deleted");
//			  
//			Query q=session.getNamedQuery("UpdateById");
//			q.setParameter("name", "kuldeep");
//			q.setParameter("age", 34);
//			q.setParameter("address", "goa");
//			q.setParameter("id", 3);
//			q.executeUpdate();
//			System.out.println("the data is updated successfully");
			t.commit();
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
		
		
	}

}
