package com.clinicalTrial.util;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory factory ;
	public static SessionFactory getHibernateSessionFactory(){
		if(factory==null){
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	
	public static Session getHibernateSession(){
		 Session session = getHibernateSessionFactory().openSession(); 
		 return session;
	}
}
