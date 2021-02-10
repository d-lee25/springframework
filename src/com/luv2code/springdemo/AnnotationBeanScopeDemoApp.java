package com.luv2code.springdemo;
/**
 * Using @Scope annotation to create two separate coaches 
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
				
		
		
		// check to see if both coaches are point to the same object
		
		System.out.println("Both coaches point to the same memory location: "+  (theCoach == alphaCoach)); 
		
		// close context
		context.close();
	}

}
