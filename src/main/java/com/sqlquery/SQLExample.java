package com.sqlquery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import com.tute.Student;
import java.util.*;

public class SQLExample {
	
	public static void main(String args[]) {
		 Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Session s=factory.openSession();
	        
	        // sql query hai yee
	        String q="select *from student";
	        
	        NativeQuery nq =s.createSQLQuery(q);
	        List<Object[]>list=nq.list();
	        
	        
	        for(Object[]student:list) {
	        	
	        	System.out.println(Arrays.deepToString(student));
	        }
	}

}
