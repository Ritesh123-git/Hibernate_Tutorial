package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Question;
import com.map.Answer;

public class CascadeExample {
	
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session s=factory.openSession();
	
	Question q1= new Question();
	
	
	
	q1.setQuestionId(567);
	q1.setQuestion("What is Cascading....");
	
	Answer a1= new Answer(23423,"In hibernate it is important concept");
	Answer a2= new Answer(255,"Second Answer");
	
	Answer a3= new Answer(35,"third answer");
	
	
	List<Answer> list =new ArrayList<Answer>();
	list.add(a1);
	list.add(a2);
	list.add(a3);
	
	q1.setAnswers(list);
	
	
	
	

}
