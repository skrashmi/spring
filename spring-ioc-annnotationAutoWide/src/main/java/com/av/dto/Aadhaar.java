package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aadhaar {
	@Autowired
	Person person;
	
	public void number()
	{
		System.out.println("4321");
		person.display();
	System.out.println(person.name);	
	}
}
