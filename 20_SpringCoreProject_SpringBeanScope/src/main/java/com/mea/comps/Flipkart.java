package com.mea.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	
	//Has-A property
	private Courier courier;
	
	public Flipkart() {

		System.out.println("Flipkart.Flipkart() :: 0-param-constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
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
