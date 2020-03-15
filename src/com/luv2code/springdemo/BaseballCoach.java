package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneService=thefortuneservice;	
	}
	 
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneservice to get a fortune
		return fortuneService.getFortune();
	}
}
