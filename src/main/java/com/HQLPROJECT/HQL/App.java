package com.HQLPROJECT.HQL;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Query;


import org.hibernate.Session;
public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sessionFactory = new Configuration().configure("HQLconfigure.xml").buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();

    	try {
    		
    		//insert 
    	    Employee newEmployee = new Employee();
//    	    newEmployee.setUname("amrat");
//    	    newEmployee.setAddress("oooo");
//    	    newEmployee.setSalary("4000");
//    	    session.save(newEmployee);
    	    System.out.println("Data is inserted successfully");

    	    
    	    //Display the data 
//    	    List<Employee> employees = session.createQuery("from Employee").list();
//    	    for (Employee emp : employees) {
//    	        System.out.println(emp);
//    	    }
    	    
    	    
    	    
    	    
    	   
    	    //Order BY     
//    	   List<Employee>er=session.createQuery("FROM Employee ORDER BY Uname,Address,Salary").list();
//    	   for(Employee t:er) {
//    		   System.out.println(t);
//    	   }
    	    
    	    
    	   //Get the employee by id
//    	   Query w=session.createQuery("From Employee where id=:id");
//    	   w.setParameter("id", 9);
//    	   List data=w.list();
//    	   System.out.println(data);
    	   
    	   //Sum Salary
//    	   Query tt=(Query) session.createQuery("Select sum(Salary) from Employee GROUP BY Salary");
//    	   List result=tt.list();
//    	   System.out.println(result);
//	    	    
    	    
    	   // Count employee
//    	    Query pp=session.createQuery("select count(Uname) from Employee");
//    	    List kk=pp.list();
//    	    System.out.println(kk);
    	    
    	    //Avg employee
//    	    Query kk=session.createQuery("select avg(Salary) from Employee");
//    	    List result=kk.list();
//    	    System.out.println(result);
    	    
    	    //Update Query
//    	    Query q=session.createQuery("UPDATE Employee SET Uname=:Uname,Address=:Address,Salary=:Salary where id=:id");
//    	    q.setParameter("Uname", "iiii");
//    	    q.setParameter("Address", "mumbai");
//    	    q.setParameter("Salary", "5000");
//    	    q.setParameter("id", 1);
//    	    System.out.println(q.executeUpdate());

    	    
    	    
    	    //Delete
//    	    Query eq=session.createQuery("delete from Employee where id=:id");
//    	    eq.setParameter("id", 1);
//    	    System.out.println(eq.executeUpdate());
    	  
//    	    String hql = "FROM Employee";
//    	    Query query = session.createQuery(hql);
//    	    query.setFirstResult(2);
//    	    query.setMaxResults(3);
//    	    List results = query.list();
//    	    System.out.println(results);

    	    transaction.commit();
    	    
    	    
    	  
   
    	} catch (Exception e) {
    	    if (transaction != null) {
    	        transaction.rollback();
    	    }
    	    e.printStackTrace();
    	} finally {
    	    session.close();
    	    sessionFactory.close();
    	}
    }
}
