package com.mea.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mea.sbeans.Flipkart;

public class AutowiredAnnotationTest {

	public static void main(String[] args) {

		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mea/cfgs/applicationContext.xml");
		
		//get target spring bean object
		Flipkart fpkt=ctx.getBean("flipkart",Flipkart.class);
		
		//get bean method
		String msg = fpkt.shopping(new String[] {"Shirt", "Trouser","Shoes"},
				       new double[] {2000.0,3000.0,4000,0});
		
		System.out.println(msg);
	}

}
