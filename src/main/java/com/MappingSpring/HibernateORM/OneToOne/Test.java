package com.MappingSpring.HibernateORM.OneToOne;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	
	
	public static void main(String args[]) {
		SessionFactory session=new Configuration().configure("Hibernate_Config.xml").buildSessionFactory();
		Session Session=session.openSession();
		Transaction t=Session.beginTransaction();
		try {
			
			
			Student s1=new Student();
			s1.setName("amrat");
				
			Student s2=new Student();
			s2.setName("mukesh");
			
			
			Address a1=new Address();
			a1.setAddress("surat");
			
			Address a2=new Address();
			a2.setAddress("mumbai");
			
			
			s1.setAddress(a2);
			s2.setAddress(a1);
			
	
			
			Session.persist(s1);
			Session.persist(s2);

			
			List<Student> student=Session.createQuery("From Student").list();
			for(Student stud:student) {
				System.out.println("the id is:="+stud.getId());
				System.out.println("the name is :="+stud.getName());
				System.out.println("the address is:"+stud.getAddress());
				
			}
			
			Query query=Session.createQuery("UPDATE Student SET name = :name WHERE id = :id");
			query.setParameter("name", "pravin");
			query.setParameter("id", 3);
			query.executeUpdate();
		
			t.commit();
			System.out.println("the transaction is successfull");
		}catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}finally {
			Session.close();
			session.close();
		}
		
		
	}

}
