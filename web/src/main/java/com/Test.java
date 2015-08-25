package com;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dongchen.entity.UserTest;
import com.dongchen.util.ClassLoaderConfig;

@Controller
@RequestMapping("test")
public class Test {

	@RequestMapping("add")
	public void add(Integer id, String uname) {
		Session session = ClassLoaderConfig.getSession();

		UserTest t = new UserTest();
		t.setUname("zzz");

		session.save(t);
	}

	public static void main(String[] args) {
		
	}

}
