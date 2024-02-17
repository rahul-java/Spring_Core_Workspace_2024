package com.mea.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mea.beans.WishMessageGenerator;
public class SetterInjectionTest {
	private static final Object WishMessageGenerator = null;

	public static void main(String[] args) {
		
		System.out.println("SetterInjectionTest.main()");
		
		//Hold the name and location of spring bean cfg file in Resource object
		
		FileSystemResource resource= new FileSystemResource("src/main/java/com/mea/cfgs/applicationContext.xml");
		
		//create BeanFactory spring container (IOC container)
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		System.out.println("======================================================");
		//get target spring bean class obj injected with Dependent spring bean class obj
		Object object=factory.getBean("wmg");
		
		WishMessageGenerator generator=(WishMessageGenerator)object;
		System.out.println("======================================================");
		String message = generator.generateMessage("Rahul");
		
		System.out.println("Wish Message :: "+message);
		System.out.println("======================================================");
	}

}
