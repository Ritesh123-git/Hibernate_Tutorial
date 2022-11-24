package com.tute;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmDemo {
	
	public static void main(String args[]) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Student student1= new Student();
		student1.setId(14134);
		student1.setName("Ritesh Dwivedi");
		student1.setCity("LKO");
		
//		Student student2= new Student();
//		student2.setId(1212);
//		student2.setName("Bunty");
//		student2.setCity("Mumbai");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Android");
		certificate1.setDuration("2 months");
		
//		Certificate certificate2 = new Certificate();
//		certificate2.setCourse("Hibernate");
//		certificate2.setDuration("1.5 months");
		
		
		student1.setCerti(certificate1);
//		student2.setCerti(certificate2);
//		
		Session s= factory.openSession();
		Transaction tx= s.beginTransaction();
		
		
		//object ko hame save krne hai
		
		s.save(student1);
//		s.save(student2);
		
		
		
		
		
		
	}

}
