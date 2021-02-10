package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortunes implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Happy New Day", 
			"Tomorrow is looking birght", 
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
