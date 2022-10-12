package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Student;

public class TestConstructorDependencyInjection {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Student student = (Student) applicationContext.getBean("student");
		student.display();

	}

}
