package com.mea.app;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mea.beans.WishMessageGenerator;
public class SetterInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("SetterInjectionTest.main()");
		
		//create IOC container (BeanFactory Container)
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mea/cfgs/applicationContext.xml");
		
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
