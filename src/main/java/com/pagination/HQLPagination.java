package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

import com.tute.Student;



public class HQLPagination {
	
	public static void main(String args[]) {
		 Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session s =factory.openSession();
	        
	        
	        Query<Student> query=s.createQuery("from Student");
	        
	        // implementing pagination using hibernate
	        
	        query.setFirstResult(0);
	        query.setMaxResults(5);
	        
	        
	        List<Student>list=query.list();
	        for(Student st:list) {
	        	System.out.println(st.getId()+" : "+st.getName()+" : "+st.getCity());
	        }
	        
	        
	        
	        
	        
	}

}
