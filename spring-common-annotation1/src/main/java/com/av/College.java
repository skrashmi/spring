package com.av;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // this is used for creating the object
public class College {
	// Dependency injection
	
	@Value("${college.name}") // @value is used to inject value to the literals like String,Integer
	private String collegename;
	

	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher; // creating bean for the interface
	
	//dependeny injection through the constructor
	
	/*public College(Principal principal) {
	
		this.principal = principal;
	}*/
	
	//dependency injection through the setter
	
	
	
	
	// when we use the @autowired before the fields no need of setter method
	
	
	/*@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	@Autowired

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}*/

	
	
	
	public void Test()
	{
		principal.principalinfo();
		teacher.teach();
		System.out.println("the college name is :"+collegename);

		System.out.println("testing");
	}

	

}
