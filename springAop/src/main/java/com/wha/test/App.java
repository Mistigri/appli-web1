package com.wha.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wha.service.SimpleService;

public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SimpleService simpleService = (SimpleService) context.getBean("simpleServiceProxy");
		simpleService.printNameId();
		System.out.println("----------------");
		try {
			simpleService.checkName();
		}catch (Exception e) {
			System.out.println("SimpleService : Method checkName () exception thrown..");
		}
		System.out.println("----------------");
		simpleService.sayHello("Javacodegeeks");
		context.close();
	}
}
