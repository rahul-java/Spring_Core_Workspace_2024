package com.mea.app;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mea.comps.Flipkart;
import com.mea.singleton.Printer;

public class ScopeTest {

	public static void main(String[] args) {

		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mea/config/applicationContext.xml");
		
		//get target spring bean object
		Flipkart fpkt=factory.getBean("flipkart",Flipkart.class);
		Flipkart fpkt1=factory.getBean("flipkart",Flipkart.class);
		
		System.out.println(fpkt.hashCode()+" :: "+fpkt1.hashCode());
		System.out.println("fpkt==fpkt1 ? "+(fpkt==fpkt1));
		
		
		System.out.println("===================================================");
		Printer p1=factory.getBean("p1",Printer.class);
		Printer p2=factory.getBean("p2",Printer.class);
		
		System.out.println(p1.hashCode()+" :: "+p2.hashCode());
		System.out.println("p1==p2 ? "+(p1==p2));
		
		
		//get bean method
		String msg = fpkt.shopping(new String[] {"Shirt", "Trouser","Shoes"},
				       new double[] {2000.0,3000.0,4000,0});
		
		System.out.println(msg);
	}

}
