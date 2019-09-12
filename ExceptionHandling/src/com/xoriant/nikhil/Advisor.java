package com.xoriant.nikhil;

import java.util.Random;

public class Advisor {
	String message[] = new String[5];
	
	public Advisor() {
		message[0]="Study";
		message[1]="Play";
		message[2]="Sleep";
		message[3]="Wake up";
		message[4]="Hide";
	}
	
	public String getAdvice() {
		Random random = new Random();
		
		return (message[random.nextInt(5)]);
		
	}

}
