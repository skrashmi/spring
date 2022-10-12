package com.springIOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CoreContainer2 {

	public static void main(String[] args) {
		ClassPathResource classPathResource = new ClassPathResource("studentspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Student2 student = (Student2) beanFactory.getBean("student1");
		student.display();

	}

}
