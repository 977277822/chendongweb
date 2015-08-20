package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class Test {
	
	@RequestMapping("add")
	public void add(Integer id, String uname) {
		
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		SessionFactory sessionFactory = ctx.getBean("sessionFactory", SessionFactory.class);
		Session session = sessionFactory.openSession();
		MainTest t = new MainTest();
		t.setUname("1212121212121");
		session.save(t);
	}

}
