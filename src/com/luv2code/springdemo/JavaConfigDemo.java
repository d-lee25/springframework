package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * This demo will use the AnnotationConfig class instead of xml to configure spring
 */
public class JavaConfigDemo {

	public static void main(String[] args) {
		
		//read in spring config file class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		// get bean from spring container
		Coach newCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		
		// call method on bean
		newCoach.getDailyWorkout();
		
		// call method on daily fortune
		newCoach.getDailyFortune();
		
		
		// close context
		context.close();
		
		
		

	}

}
