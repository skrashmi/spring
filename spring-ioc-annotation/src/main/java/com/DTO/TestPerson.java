package com.DTO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Person p= (Person) applicationContext.getBean("person");
		p.savePerson(1, "Rohit", 38);
		p.getPerson();

	}

}
