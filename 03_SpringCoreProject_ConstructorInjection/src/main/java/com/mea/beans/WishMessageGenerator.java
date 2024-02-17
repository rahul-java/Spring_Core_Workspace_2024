package com.mea.beans;

import java.util.Date;


public class WishMessageGenerator {

	//Has-A property (supporting or Injection)
	private Date date;
	
	//constructor injection
	public WishMessageGenerator(Date date) {
		this.date=date;
     System.out.println("WishMessageGenerator.WishMessageGenerator():::1-param-constructor");
     System.out.println(this.date);
	}
	
	
	//setter injection
	public void setDate(Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator.setDate()");
		System.out.println(this.date);
	}



	public String generateMessage(String user)
	{
		System.out.println("WishMessageGenerator.generateMessage()");
		System.out.println(this.hashCode()+" "+date.hashCode());
		System.out.println(this.date);
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
