package com.mea.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mea.beans.A;

public class GenericTypeTest {
	
	public static void main(String[] args) {
		
		//create IOC Container
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/mea/cfgs/applicationContext.xml"));
		
		//get spring bean class obj ref by generic type
		A a = factory.getBean("a1",A.class);
		
		System.out.println(a);
	}

}
