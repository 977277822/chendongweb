package com.dongchen.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassLoaderConfig{
	private static  SessionFactory sessionFactory = null;
	
	private static Session session = null;
	
	private static String SPRINTCONFIG = "classpath:spring/application-config.xml";

	
	
	@SuppressWarnings("resource")
	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(SPRINTCONFIG);
			sessionFactory = ctx.getBean("sessionFactory", SessionFactory.class);
		}
		return sessionFactory;
	}
	
	public static Session getSession(){
		if(session == null){
			session = getSessionFactory().openSession();
		}
		return session;
	}
}
