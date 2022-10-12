package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("manisha")
	public String name;
//	
//	@Autowired
//	Aadhaar aadhaar;
//	
	public void display()
	{
		System.out.println("Raju");
	
	}
}
