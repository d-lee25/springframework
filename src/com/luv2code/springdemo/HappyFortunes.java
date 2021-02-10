package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortunes implements FortuneService {

	public String getFortune() {
		
		
		return "Today is your lucky day!";
	}

}
