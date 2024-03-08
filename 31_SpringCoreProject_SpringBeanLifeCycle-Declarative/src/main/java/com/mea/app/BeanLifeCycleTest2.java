package com.mea.app;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mea.beans.VoteEligibilityCheckingService;

public class BeanLifeCycleTest2 
{
    public static void main( String[] args )
    {
       //create BeanFactory IOC container
    	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/mea/cfgs/applicationContext.xml");
    	
    	//get spring bean class obj ref
    	VoteEligibilityCheckingService service = factory.getBean("voting",VoteEligibilityCheckingService.class);
    	
    	//invoke b.method
    	String result = service.checkVotingEligibility();
    	
    	System.out.println(result);
    	
    	//destroy singletons
    	factory.destroySingletons();
    }
}
