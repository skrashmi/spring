package com.av;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="com.av")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	//this method will return the college object
	
	// this method will return the object of the college
		
	//Another method to create a bean
	
	//@Bean(name={"rashmi","swathi"}) // multiple bean name can be given
	
	//creating bean for interface(teacher)
	
	
	/*@Bean
	public Teacher MathTeacher()
	{
		return  new MathTeacher();
	}
	
	
	//creating the bean of principal
	@Bean
	public Principal pricipalBean()
	{
		return new Principal();
	}
	
	
	
	
	@Bean (name="rashmi")//rashmi-bean id
	
	public College collegeBean() // here CollegeBean- bean id
	{
		College college = new College();
		college.setPrincipal(pricipalBean()); //Beacause we are using setter method to inject the dependency
		college.setTeacher(MathTeacher());
		
		return college;
		
		//or
		// return new College();
	}*/
	

}
