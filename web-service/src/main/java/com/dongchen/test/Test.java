package com.dongchen.test;

import org.hibernate.Session;

import com.dongchen.entity.UserTest;
import com.dongchen.util.ClassLoaderConfig;

public class Test {
	
	
	public static void main(String[] args) {
		Session session  = ClassLoaderConfig.getSession();
		
		UserTest t = new UserTest();
		t.setUname("zzz");
		
		session.save(t);
	}
}
