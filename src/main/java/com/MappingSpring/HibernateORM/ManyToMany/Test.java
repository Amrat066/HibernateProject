package com.MappingSpring.HibernateORM.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[]) {
		
		SessionFactory sessionfactory=new Configuration().configure("Hibernate_Config.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		 try {
			 
	            Address3 address1 = new Address3("Dindoli");
	            Address3 address2 = new Address3("Katargam");
	            
	            
	            // Create student1
	            Student3 student1 = new Student3("nirav");
	            List<Address3> add=new ArrayList<Address3>();
	            add.add(address1);
	            add.add(address2);
	            student1.setAddress(add);
	            
	            
	            Address3 address3=new Address3("karan");
	            Address3 address4=new Address3("hiren");
	            
	            
	            // Create student2

	            Student3 student2 = new Student3("aniket");
	            List<Address3>address=new ArrayList<>();
	            address.add(address3);
	            address.add(address4);
	            student2.setAddress(address);
	            
//	            session.persist(student1);
//	            session.persist(student2);
//	            
	            
	            List<Student3> s=session.createQuery("From Student3").list();
	            for(Student3 stud:s)
	            {
	            	System.err.println("the student details is:="+stud);
	            	System.err.println("the address is:="+stud.getAddress());
	            }
	            
	            
	            //Updted Query
	            Query q=session.createQuery("Update Student3 set name=:name where id=:id");
	            q.setParameter("name", "kuldepp");
	            q.setParameter("id", 4);
	            int query=q.executeUpdate();
	            System.out.println("the data is updated"+query);
	            
	            
	            
	            //insert query
	            
	            
	            
	            t.commit();

	            System.out.println("Data saved successfully.");
	        } catch (Exception e) {
	            t.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	            sessionfactory.close();	     
	        }
	}
}
