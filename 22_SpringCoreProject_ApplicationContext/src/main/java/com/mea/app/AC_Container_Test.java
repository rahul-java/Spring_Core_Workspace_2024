package com.mea.app;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mea.comps.Flipkart;
import com.mea.singleton.Printer;

public class AC_Container_Test {

	public static void main(String[] args) {

		//create IOC container
		//create bean factory container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mea/config/applicationContext.xml");
		
		//get target spring bean object
		Flipkart fpkt=factory.getBean("flipkart",Flipkart.class);
		Flipkart fpkt1=factory.getBean("flipkart",Flipkart.class);
		
		System.out.println(fpkt.hashCode()+" :: "+fpkt1.hashCode());
		System.out.println("fpkt==fpkt1 ? "+(fpkt==fpkt1));
		
		
		//get bean method
		String msg = fpkt.shopping(new String[] {"Shirt", "Trouser","Shoes"},
				       new double[] {2000.0,3000.0,4000,0});
		
		System.out.println(msg);
	}

}
