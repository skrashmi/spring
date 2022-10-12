package com.av.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.av.MyConfig;
import com.av.dto.Branch;

public class TestBranchAddress {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Branch branch = (Branch) applicationContext.getBean("branch");
		branch.display();
	}

}
