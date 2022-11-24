package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tute.Certificate;
import com.tute.Student;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pratical of Hibernate object states
		
		// Transient
		// Persistent
		// Detached
		// Removed
		
		SessionFactory f= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Student student = new Student();
		student.setId(1414);
		student.setName("peter");
		student.setCity("ABC");
		student.setCerti(new Certificate("Java Hibernate Course", "2 month"));
		
		// student : Transient
		
		
		Session s=f.openSession();
		Transaction tx=s.beginTransaction();
		s.save(student);
		// student : Persistent -------- session,database
		student.equals("john");
		tx.commit();
		s.close();
		
		// student : Detached
		
		student.setName("sachin");
	
		

	}

}
