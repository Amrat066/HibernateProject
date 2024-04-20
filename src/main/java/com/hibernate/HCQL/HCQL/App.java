package com.hibernate.HCQL.HCQL;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;


public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory=new Configuration().configure("HCQLhibernate.xml").buildSessionFactory();
       Session session= factory.openSession();
       Transaction transaction = session.beginTransaction();
       try {
    	   
//    	   Student s=new Student();
//    	   s.setName("amrat");
//    	   s.setAddress("surat");
//    	   s.setAge(14);
//    	   
//    	   Student s1=new Student();
//    	   s1.setName("hitesh");
//    	   s1.setAddress("surat");
//    	   s1.setAge(24);
//    	   
//    	   Student s2=new Student();
//    	   s2.setName("satish");
//    	   s2.setAddress("surat");
//    	   s2.setAge(24);
//    	   
//    	   Student s3=new Student();
//    	   s3.setName("mukesh");
//    	   s3.setAddress("surat");
//    	   s3.setAge(10);
//    	  
//    	   session.save(s);
//    	   session.save(s1);
//    	   session.save(s2);
//    	   session.save(s3);
    	   
    	   
    	 
    	   
    	   Criteria cr=session.createCriteria(Student.class);
    	 //  cr.add(Restrictions.isNull("name")); //here we can use gt,lt,eq,ne,between,like,ilike,isnull,isnotnull,isempty
    	   
    	   //and expression
    	   
//    	   Criterion age = Restrictions.lt("age", 21);
//    	   Criterion name = Restrictions.ilike("name","amrat");
//    	   
//    	   LogicalExpression log= Restrictions.and(age, name);
//    	   cr.add(log);
    	   
    	   //or expression
    	   
//    	   Criterion age = Restrictions.lt("age", 21);
//    	   Criterion name = Restrictions.ilike("name","amrat");
//    	   
//    	   LogicalExpression log= Restrictions.or(age, name);
//    	   cr.add(log);
    	   
    	   
    	   //Pagination method
//    	   
//    	   cr.setFirstResult(0);
//    	   cr.setMaxResults(2);
//    	   
    	   
    	   
    	   //sorting the result
    	   
//    	   cr.addOrder(Order.asc("id"));
//    	   cr.addOrder(Order.desc("id"));
    	   
    	   
    	   //Projections and aggregations
    	   
    	   cr.setProjection(Projections.rowCount());
    	   cr.setProjection(Projections.avg("age"));
    	   cr.setProjection(Projections.count("id"));
    	   cr.setProjection(Projections.min("age"));
    	   cr.setProjection(Projections.max("id"));
    	   cr.setProjection(Projections.sum("age"));
    	   
    	   List<Student>s=cr.list();
    	   for(Student h:s) {
    		   System.out.println(h);
    	   }
    	   
    	  
    	   transaction.commit();
       }catch(Exception e) {
    	   
    	   transaction.rollback();
    	   e.printStackTrace();
    	   
       }finally {
    	   session.close();
    	   factory.close();
       }
       
       
    }
}
