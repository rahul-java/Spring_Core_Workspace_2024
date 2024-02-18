package com.mea.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.mea.beans.Student;
import com.mea.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("ConstructorInjectionTest.main()");
		
		//Hold the name and location of spring bean cfg file in Resource object
		
		//FileSystemResource resource= new FileSystemResource("src/main/java/com/mea/cfgs/applicationContext.xml");
		
		ClassPathResource resource = new ClassPathResource("com/mea/cfgs/applicationContext.xml");
		
		//ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		
		//create BeanFactory spring container (IOC container)
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		System.out.println("--------------------------------------------------------");
		//get target spring bean class obj injected with Dependent spring bean class obj
		Object object=factory.getBean("wmg");
		
		WishMessageGenerator generator=(WishMessageGenerator)object;
		System.out.println("-------------------------------------------------------------");
		String message = generator.generateMessage("Rahul");
		
		System.out.println("Wish Message :: "+message);
		System.out.println("======================================================");
		
		Student student=(Student)factory.getBean("std");
		System.out.println(student);
		
	}

}
