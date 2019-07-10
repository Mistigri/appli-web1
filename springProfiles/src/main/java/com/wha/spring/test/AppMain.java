package com.wha.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//sets the active profiles
		context.getEnvironment().setActiveProfiles("Development");
		//scans the mentioned package and register all the @component available to spring 
		context.scan("com.wha.spring");
		context.refresh();
		context.close();
	}
}
