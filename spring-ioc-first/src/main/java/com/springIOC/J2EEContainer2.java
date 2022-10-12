package com.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class J2EEContainer2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("studentspring.xml");
		Student2 student = (Student2) applicationContext.getBean("student1");
		student.display();

	}

}
