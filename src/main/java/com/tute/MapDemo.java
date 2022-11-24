package com.tute;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        
	        // Creating Question
	        Question q1= new Question();
	        q1.setQuestionId(1212);
	        q1.setQuestion("what is java");
	        
//	        Question q2= new Question();
//	        q2.setQuestionId(242);
//	        q2.setQuestion("What is collection framework" );
//	     
//	        
//	        Question q3= new Question();
//	        q3.setQuestionId(234324);
//	        q3.setQuestion("How to work with netbeans");
//	        
	        Answer answer= new Answer();
	        answer.setAnswerId(343);
	        answer.setAnswer("Java is programming language");
//	       
//	        Answer answer2= new Answer();
//	        answer2.setAnswerId(344);
//	        answer2.setAnswer("API to work with group of objects");
//	        
//	        Answer answer3= new Answer();
//	        answer3.setAnswerId(777);
//	        answer3.setAnswer("IDE for writing codes");
//	        
//	        
//	        Answer answer4= new Answer();
//	        answer4.setAnswerId(7776);
//	        answer4.setAnswer("Python programming language to");
//	        
	        
	        q1.setAnswer(answer);
//	        q2.setAnswer(answer2);
//	        q3.setAnswer(answer3);
//	  
	        
	        
	    
	        
	        Session s=factory.openSession();
	        Transaction tx= s.beginTransaction();
	        
	        s.save(q1);
//	        s.save(q2);
//	        s.save(q3);
	       
	        
	}
}