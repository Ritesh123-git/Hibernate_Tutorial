package com.map;

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
//	        Question q1= new Question();
//	        q1.setQuestionId(1);
//	        q1.setQuestion("what is java");
//	        
//	        Question q2= new Question();
//	        q2.setQuestionId(2);
//	        q2.setQuestion("What is collection framework" );
////	     
////	        
//	        Question q3= new Question();
//	        q3.setQuestionId(3);
//	        q3.setQuestion("How to work with netbeans");
//////	        
//	        Answer answer= new Answer();
//	        answer.setAnswerId(1);
//	        answer.setAnswer("Java is programming language");
//	        answer.setQuestion(q1);
////	       
//	        Answer answer2= new Answer();
//	        answer2.setAnswerId(2);
//	        answer2.setAnswer("API to work with group of objects");
//	        answer2.setQuestion(q2);
////	        
//	        Answer answer3= new Answer();
//	        answer3.setAnswerId(3);
//	        answer3.setAnswer("IDE for writing codes");
//	        answer3.setQuestion(q3);
//	        
//	        
//	        Answer answer4= new Answer();
//	        answer4.setAnswerId(4);
//	        answer4.setAnswer("Python programming language to");
//	        
//	        
//	        q1.setAnswer(answer);
//	        q2.setAnswer(answer2);
//	        q3.setAnswer(answer3);
////	  
	        
	        Question q1= new Question();
	        q1.setQuestionId(202);
	        q1.setQuestion("what is java");
	        
	        
	        // creating answer
	        
	        Answer answer = new Answer();
	        answer.setAnswerId(3430);
	        answer.setAnswer("Java is programming language");
	        answer.setQuestion(q1);
//	        
//	        
	        Answer answer1 = new Answer();
	        answer1.setAnswerId(3440);
	        answer1.setAnswer("Java is language through which we can do the development ");
	        answer1.setQuestion(q1);
//	        
//	        
	        Answer answer2 = new Answer();
	        answer2.setAnswerId(3450);
	        answer2.setAnswer("Java is a tool");
	        answer2.setQuestion(q1);
//	        
//	        
	        List<Answer > list = new ArrayList<Answer>();
	        list.add(answer);
	        list.add(answer1);
	        list.add(answer2);
//	        
	        
	        q1.setAnswers(list);
	        

	        
	        
	        
	        
	        
	        
	        
	        
	    
	        
	        Session s=factory.openSession();
	        Transaction tx= s.beginTransaction();
	        s.save(q1);  
	        s.save(answer);
	        s.save(answer1);
	        s.save(answer2);
//	      
	        tx.commit();
	        
	        
	        Question q=(Question)s.get(Question.class, 202);
	        System.out.println(q.getQuestion());
	    
	       
	        
	}
}