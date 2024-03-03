package com.mea.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	
	//Has-A property
	@Autowired
	//@Qualifier("blueDart")
	private Courier courier;
	
	public Flipkart() {

		System.out.println("Flipkart.Flipkart() :: 0-param-constructor");
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
