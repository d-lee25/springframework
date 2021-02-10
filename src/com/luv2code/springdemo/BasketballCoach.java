package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach() {
		System.out.println("BasketballCoach: inside constructor.");
	}
	
	@Autowired
	@Qualifier("databaseFortuneService")
	public void newMethod(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public String getDailyWorkout() {
		
		return "shoot 100 freethrows";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
