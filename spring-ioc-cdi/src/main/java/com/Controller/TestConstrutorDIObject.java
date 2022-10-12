package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Car;

public class TestConstrutorDIObject {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myobject.xml");
		Car car = (Car)  applicationContext.getBean("mycar");
		car.playingMusic.play();

	}

}
