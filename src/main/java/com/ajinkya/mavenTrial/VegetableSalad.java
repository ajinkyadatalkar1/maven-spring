package com.ajinkya.mavenTrial;

import org.springframework.stereotype.Component;

@Component
public class VegetableSalad implements salad {
	public void chop() {
		System.out.println("Chop vegetables");
	}
	
	public void mix() {
		System.out.println("Mix chopped vegetables");
	}
	
}
