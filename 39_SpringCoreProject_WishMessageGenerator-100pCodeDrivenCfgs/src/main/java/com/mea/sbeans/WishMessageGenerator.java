package com.mea.sbeans;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	//HAS-A property
	@Autowired
	private LocalDateTime localDateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator() :: 0-param-constructor");
	}

	//b.method
	public String generateWishMessage(String user) {
		int hour = localDateTime.getHour();  //24 Hour format
		
		if(hour<12)
			return "Good Morning :: "+user;
		else if(hour<16)
			return "Good Afternoon :: "+user;
		else if (hour<20)
			return "Good Evening :: "+user;
		else
			return "Good Night :: "+user;
	}
}
