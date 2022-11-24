package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tute.Student;

public class FirstDemo {
	

	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	
	
	// by default enabled
	
	Student student=session.get(Student.class,101)
	System.out.println(student);


}
