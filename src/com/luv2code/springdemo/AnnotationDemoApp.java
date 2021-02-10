package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container using annotation
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach bballCoach = context.getBean("basketballCoach", Coach.class);
		
		// call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("If you're on the basketball team, then: " + bballCoach.getDailyWorkout());
		
		// call method to the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(bballCoach.getDailyFortune());
		// close the context
		context.close();
		

	}

}
