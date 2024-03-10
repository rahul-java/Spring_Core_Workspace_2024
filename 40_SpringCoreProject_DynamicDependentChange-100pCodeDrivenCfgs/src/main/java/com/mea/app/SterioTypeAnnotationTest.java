package com.mea.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mea.cfgs.AppConfig;
import com.mea.sbeans.Flipkart;

public class SterioTypeAnnotationTest {

	public static void main(String[] args) {

		//create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring bean object
		Flipkart fpkt=ctx.getBean("flipkart",Flipkart.class);
		
		//get bean method
		String msg = fpkt.shopping(new String[] {"Shirt", "Trouser","Shoes"},
				       new double[] {2000.0,3000.0,4000,0});
		
		System.out.println(msg);
	}

}

/*
 * Order of injection is:
 * 1.Constructor
 * 2.Field Level
 * 3.Setter/Arbitrary Method who comes first at the time of execution=>Finally injected spring bean
 * 
 * DTDC.DTDC() :: 0-param-constructor
BlueDart.BlueDart() :: 0-param-constructor
FirstFlight.FirstFlight() :: 0-param-constructor
DHL.DHL() :: 0-param-constructor
Flipkart.Flipkart() :: 1-param-constructor ::class com.mea.sbeans.FirstFlight
Flipkart.setCourier() ::class com.mea.sbeans.DTDC
Flipkart.assignCourier() ::class com.mea.sbeans.DHL
Flipkart.shopping()
[Shirt, Trouser, Shoes] are purchased having bill amount :9000.0---->58750 order id Order assigned to DHL

 */
		
