package com.ajinkya.mavenTrial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public OrderNum no() {
		return new OrderNum();
	}
}
