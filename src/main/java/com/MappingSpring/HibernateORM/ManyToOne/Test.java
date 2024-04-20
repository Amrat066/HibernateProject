package com.MappingSpring.HibernateORM.ManyToOne;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {
	
	public static void main(String args[]) {
		
		SessionFactory Session=new Configuration().configure("Hibernate_Config.xml").buildSessionFactory();
		Session session=Session.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			
			Student2 s1=new Student2("sheema");
			Student2 s2=new Student2("kajal");
			Student2 s3=new Student2("manisha");
			
			Address2 address1=new Address2("up");
			Address2 address2=new Address2("bihar");
		
			
			s1.setAddress(address1);
			s2.setAddress(address1);
			s2.setAddress(address2);
			s3.setAddress(address1);
			
			
			
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
			transaction.commit();
			
			
			List<Student2> s=session.createQuery("From Student2").list();
			for(Student2 student:s) {
				System.err.println("Student details:="+student);
				System.err.println("the address is:="+student.getAddress());
			}
			
		}catch(Exception e) {
			
			transaction.rollback();
			e.printStackTrace();
			
		}finally {
			session.close();
			Session.close();
		}
		
	
	}

}
