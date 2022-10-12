package com.av.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.DTO.Teacher;

public class TestSetterDependencyInjection {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Teacher teacher =  (Teacher) applicationContext.getBean("teacher");
		teacher.display();
		
	}

}
