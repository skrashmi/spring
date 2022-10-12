package com.av;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	// WHILLE USING XML FILE 
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	
		
		//WHILE USING CONFIGURATION CLASS RATHER THAN XML FILE
		
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		System.out.println("rashmih");
		College college=applicationContext.getBean("college", College.class);
		System.out.println("shobha");
		college.Test();
	}

}
