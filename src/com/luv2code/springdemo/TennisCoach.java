package com.luv2code.springdemo;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice service shot for 20 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
