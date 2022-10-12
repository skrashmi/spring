package com.av.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.av.MyConfig;
import com.av.dto.Aadhaar;
import com.av.dto.Person;

public class TestPersonAadhaar {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Aadhaar a =  (Aadhaar) applicationContext.getBean("aadhaar");
		a.number();
	}

}
