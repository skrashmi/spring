package com.dto;

public class Student {
	int id;
	String name;
	int age;
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println(id + " " + name + " " + age);
	}
	
	
}
