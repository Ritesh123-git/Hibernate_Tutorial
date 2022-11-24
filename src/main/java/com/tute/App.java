package com.tute;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
	
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
       // creating student
        
        Student st= new Student();
        st.setId(107);
        st.setName("karan sherdil");
        st.setCity("banaras");
        System.out.println(st);
        
        Certificate certificate1 = new Certificate();
		certificate1.setCourse("codechef certification ");
		certificate1.setDuration("7 months");
		
		st.setCerti(certificate1);
       // Session session=factory.getCurrentSession();
        
        
//        Address ad= new Address();
//        ad.setStreet("street2");
//        ad.setCity("pune");
//        ad.setOpen(true);
//        ad.setAdedDate(new Date(0));
//        ad.setX(1234.234);
//        
//        // Reading image
//        FileInputStream  fis= new FileInputStream("src/main/java/Hackerrank logo.jfif");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        ad.setImage(data);
		
		
//		 Question q1= new Question();
//	        q1.setQuestionId(1212);
//	        q1.setQuestion("what is java");
//	        
//	        Answer answer= new Answer();
//	        answer.setAnswerId(343);
//	        answer.setAnswer("Java is programming language");
//	        
//	        q1.setAnswer(answer);
        
        
        Session session = factory.getSessionFactory().openSession();
        
        Transaction tx=session.beginTransaction();
        session.save(st);
//        session.save(q1);
        
//        session.save(ad);
        
        tx.commit();
        session.close();
        System.out.println("Done.......");
        
        
    
    }
}
