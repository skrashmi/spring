package com.av.DTO;

//Setters dependent Injection -- SDI
//Injecting values from one class to another class using setter() methods

public class Teacher {
	int id;
	String name;
	int salary;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display()
	{ 
		System.out.println("ID     : " + id);
		System.out.println("Name   : " + name);
		System.out.println("Salary : " + salary + " lpa");
	}
}
