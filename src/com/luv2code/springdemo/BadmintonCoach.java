package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	public BadmintonCoach() {
		
	}
	
	public BadmintonCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice for smash shots for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
