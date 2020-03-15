package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file 
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods of bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method for fortune services
		System.out.println(theCoach.getDailyFortune());
		 
		//close the context
		context.close();
	}

}
