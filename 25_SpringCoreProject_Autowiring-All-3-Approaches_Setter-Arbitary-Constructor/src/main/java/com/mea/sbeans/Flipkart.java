package com.mea.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	
	//Has-A property
	@Autowired
	@Qualifier("blueDart")
	private Courier courier;
	
	public Flipkart() {

		System.out.println("Flipkart.Flipkart() :: 0-param-constructor");
	}
	
	//Autowired using Constructor
	
	@Autowired
	public Flipkart(@Qualifier("fFlight") Courier courier) {

		System.out.println("Flipkart.Flipkart() :: 1-param-constructor ::"+courier.getClass());
		this.courier = courier;
	}
	
	//Autowired using setter method 
	
   @Autowired
   @Qualifier("dtdc")
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier() ::"+courier.getClass());
		this.courier = courier;
	}
   
	
	//Autowired using arbitary method
  
	@Autowired
   @Qualifier("dhl")
	public void assignCourier(Courier courier) {
		System.out.println("Flipkart.assignCourier() ::"+courier.getClass());
		this.courier = courier;
	}



	public String shopping(String items[],double prices[])
	{
		System.out.println("Flipkart.shopping()");
		//calculate bill amount
		double billAmt=0.0;
		for(double price:prices)
		{
			billAmt+=price;
		}
		
		//generate orderID
		int orderID=new Random().nextInt(100000);
		
		//use courier
		String msg = courier.deliver(orderID);
		
		return Arrays.toString(items)+" are purchased having bill amount :"+billAmt+"---->"+msg;
	}

}
