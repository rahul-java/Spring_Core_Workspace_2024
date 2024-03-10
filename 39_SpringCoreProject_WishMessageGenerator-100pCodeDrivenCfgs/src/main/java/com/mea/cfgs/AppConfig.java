package com.mea.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mea")
public class AppConfig {

	public AppConfig() {

		System.out.println("AppConfig.AppConfig() :: 0-param-constructor");
	}
	
	@Bean(name = "ldt")  //@Bean(value = "ldt") //@Bean("ldt")
	public LocalDateTime createLocalDateTime() {
		System.out.println("AppConfig.createLocalDateTime()");
		return LocalDateTime.now();
	}
}
