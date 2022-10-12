package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Branch {
	/*
	 * First method using setter()
	
	@Autowired
	Address address;

	public void setAddress(Address address) {
		this.address = address;
	}
	
	*/
	
	// Second method using constructor
	
	Address address;
	public Branch(@Autowired Address address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("ABC Layout");
		address.display();
	}
}
