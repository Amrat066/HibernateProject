package com.MappingSpring.HibernateORM.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

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
			
			Address1 a1=new Address1();
			a1.setAddress("vadodra");
			
			
			Address1 a2=new Address1();
			a2.setAddress("rajasthan");
			 
			
			List<Address1> address=new ArrayList<Address1>();
			
			address.add(a1);
			address.add(a2);
			
			Student1 st=new Student1();
			st.setName("satish");
			st.setAdd(address);
			
			Session.persist(st);
			
			
			List<Student1> sp=Session.createQuery("from Student1").list();
			for(Student1 s:sp) {
				System.err.println("the id id:="+s.getId());
				System.err.println("the name is:="+s.getName());
				System.err.println("the address is:="+ s.getAdd());
			}
			
			Session.getTransaction().commit();
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
