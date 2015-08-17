package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class Test {

	@RequestMapping("add")
	public void add(Integer id , String uname) {
		System.out.println(id + "--->" + uname);
	}
	
}
