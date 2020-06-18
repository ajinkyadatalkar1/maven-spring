package com.ajinkya.mavenTrial;

import org.springframework.stereotype.Component;

@Component
public class CustomerName {
	private String name;

	public CustomerName(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomerName [name=" + name + "]";
	}
}
