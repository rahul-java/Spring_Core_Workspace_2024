package com.mea.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mea.beans.A;

public class CircularInjectionTest {
	
	public static void main(String[] args) {
		
		//create IOC Container
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/mea/cfgs/applicationContext.xml"));
		
		//get spring bean class obj ref
		A a = (A)factory.getBean("a1");
		
		System.out.println(a);
	}

}
