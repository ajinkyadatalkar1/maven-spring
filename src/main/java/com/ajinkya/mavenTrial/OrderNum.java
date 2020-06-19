package com.ajinkya.mavenTrial;

import org.springframework.stereotype.Component;

@Component
public class OrderNum {
	private int onum=3;

	@Override
	public String toString() {
		return "OrderNum [onum=" + onum + "]";
	}
}
