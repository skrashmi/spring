package com.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class J2EEContainer {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		//ClassPathResource not required for J2EE Container 
		Pen pen = (Pen) applicationContext.getBean("pen1");	//getBean returns a object, it is downcasted to pen object
		pen.penDetails();
		

	}

}
