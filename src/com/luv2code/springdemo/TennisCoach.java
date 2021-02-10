package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortunes")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: Inside the default constructor");
	}
	
	
	//create init methods
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside doMyStartUpStuff: will read in a txt file now" );
		
		
		// read in file using Scanner
		File file = new File("C:/Users/Drew/Desktop/newFortune.txt");
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("This is the end of my init method...");
		
	}
	
	// define destroy methods
	@PreDestroy
	public void doMyCleanUp() {
		System.out.println("Inside cleanup method");
	}
	
	
	
	
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	// using setter method for autowire
	
	
	/*
	 * using constructor method for autowire
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	public String getDailyWorkout() {
		
		return "Practice backhand volley";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
