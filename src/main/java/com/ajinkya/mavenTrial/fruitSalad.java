package com.ajinkya.mavenTrial;

import org.springframework.stereotype.Component;

@Component
public class fruitSalad implements salad {
	public void chop() {
		System.out.println("Chop fruits");
	}
	
	public void mix() {
		System.out.println("Mix chopped fruits");
	}
}
