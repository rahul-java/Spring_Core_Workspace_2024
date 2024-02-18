package com.mea.beans;

import java.util.Date;


public class WishMessageGenerator {

	//Has-A property (supporting or Injection)
	private Date date;
	
	public WishMessageGenerator() {
     System.out.println("WishMessageGenerator.WishMessageGenerator():::0-param-constructor");
	}

	//Setter method supporting Setter Injection
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	public String generateMessage(String user)
	{
		System.out.println("WishMessageGenerator.generateMessage()");
		System.out.println(this.hashCode()+" "+date.hashCode());
		int hour=date.getHours();  //return 0 to 23
		
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else 
			return "Good Night "+user;
	}
	
}
