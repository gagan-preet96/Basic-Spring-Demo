package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCyclePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file 
		ClassPathXmlApplicationContext context =
		 new ClassPathXmlApplicationContext("beanLifeCyclePractice-applicationContext.xml");

		//retrieve bean from xml
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check both are same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nboth beans are same : " + result);
		
		System.out.println("\n address of theCoach :" + theCoach);
		
		System.out.println("\n address of alphaCoach :" + alphaCoach);
		
		//close the context
		context.close();		
		
	}

}
