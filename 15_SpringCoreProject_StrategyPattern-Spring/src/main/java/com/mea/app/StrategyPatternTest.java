package com.mea.app;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mea.comps.Flipkart;

public class StrategyPatternTest {

	public static void main(String[] args) {

		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mea/config/applicationContext.xml");
		
		//get target spring bean object
		Flipkart fpkt=factory.getBean("flipkart",Flipkart.class);
		
		//get bean method
		String msg = fpkt.shopping(new String[] {"Shirt", "Trouser","Shoes"},
				       new double[] {2000.0,3000.0,4000,0});
		
		System.out.println(msg);
	}

}

/*
Flipkart.Flipkart() :: 0-param-constructor
DTDC.DTDC() :: 0-param-constructor
Flipkart.setCourier()
Flipkart.shopping()
[Shirt, Trouser, Shoes] are purchased having bill amount :9000.0---->68419 order id Order assigned to DTDC

*/