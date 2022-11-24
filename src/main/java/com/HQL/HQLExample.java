package com.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tute.Student;

public class HQLExample {
	
	public static void main(String args[]) {
		   Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session s=factory.openSession();
	        
	        // HQL
	        // Syntax:
	        //
	        String query="from Student where city='lucknow'";
	       Query q=s.createQuery(query);
	       
	       //single ----------------------Unique
	       //multiple---------------------Multiple
	       List<Student>list=q.list();
	       
	       for(Student student:list) {
	    	   System.out.println(student.getName());
	       }
	       
	       System.out.println("-------------------------------------------");
	       
	       
	       Transaction tx=s.beginTransaction();
	       // delete Query
//	       Query q2=s.createQuery("delete from Student s  where s.city=:c");
//	       q2.setParameter("c", "lucknow");
//	       int r=q2.executeUpdate();
//	       System.out.println("Deleted:");
//	       System.out.println(r);
	       
	       // Update Query
	       Query q2=s.createQuery("update Student set city=:c where name=:n");
	       q2.setParameter("c", "Delhi");
	       q2.setParameter("n", "bunty");
	       int r=q2.executeUpdate();
	       System.out.println(r+   "objects updated");
	       
	       
	       //how to execute join query
	      Query q3= s.createQuery("select q.question, q.questionId, a.answer from Question as q INNER JOIN q.answers as a");
	      List<Object [] > list3= q3.getResultList();
	      
	      for(Object [] arr:list3) {
	    	  System.out.println(Arrays.deepToString(arr));
	      }
	      
	       
	       
	       
	       tx.commit();
	       
	        
	        
	}

}
