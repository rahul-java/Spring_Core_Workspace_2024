package com.mea.factory;

import com.mea.comps.BlueDart;
import com.mea.comps.Courier;
import com.mea.comps.DTDC;
import com.mea.comps.Flipkart;

//Factory Pattern
public class FlipkartFactory {

	//static factory method
	public static Flipkart getInstance(String courierType)
	{
		//create dependent class obj
		Courier courier =null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier=new BlueDart();
		else throw new IllegalArgumentException("Invalid Courier Type.");
		
		//create target class obj
		Flipkart flipkart = new Flipkart();
		
		//assign dependent class obj to  target class obj
		flipkart.setCourier(courier);
		
		return flipkart;
	}
}
