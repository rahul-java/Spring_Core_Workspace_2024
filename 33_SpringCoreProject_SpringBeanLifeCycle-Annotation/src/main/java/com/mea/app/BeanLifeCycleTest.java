package com.mea.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mea.beans.VoteEligibilityCheckingService;

public class BeanLifeCycleTest 
{
    public static void main( String[] args )
    {
       //create container
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/mea/cfgs/applicationContext.xml");
    	
    	//get spring bean class obj ref
    	VoteEligibilityCheckingService service = ctx.getBean("voting",VoteEligibilityCheckingService.class);
    	
    	//invoke b.method
    	String result = service.checkVotingEligibility();
    	
    	System.out.println(result);
    	
    	//close container
    	ctx.close();
    }
}
