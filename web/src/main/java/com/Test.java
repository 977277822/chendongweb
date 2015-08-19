package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class Test {
	
	@RequestMapping("add")
	public void add(Integer id, String uname) {
		Configuration config = new Configuration().configure("/hibernate/hibernate.cfg.xml");;
		SessionFactory sf = config.buildSessionFactory(new ServiceRegistryBuilder().configure().buildServiceRegistry());
		Session session = sf.openSession();
		MainTest t = new MainTest();
		t.setId(1);
		t.setUname("ddd");
		session.save(t);
		System.out.println(id + "--->" + uname);
	}

}
