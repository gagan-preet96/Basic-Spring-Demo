package com.luv2code.springdemo;

import java.util.Random;

public class DailyFortuneService implements FortuneService {

	private String[] fortuneArr= {
	"have a good day",
	"good job",
	"best of luck for your future"
	};
	
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		int index =myRandom.nextInt(fortuneArr.length);
		
		String theFortune = fortuneArr[index];
		
		return theFortune;
	}

}
