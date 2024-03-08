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

/*
 VoteElgibilityCheckingService:: 0-param constructor
VoteElgibilityCheckingService.setName()
VoteElgibilityCheckingService.setAge()
VoteEligibilityCheckingService.myVoteInit() :: @PostConstruct :: Annotation
VoteEligibilityCheckingService.afterPropertiesSet() :: @Override :: Programatic
VoteEligibilityCheckingService.voteInit() :: Declarative
VoteElgibilityCheckingService.checkVotingElgibility()::Fri Mar 08 23:46:57 IST 2024
Mr./Miss/Mrs. raja your  elgible for Voting
VoteEligibilityCheckingService.myVoteDestroy() :: @PreDestroy :: Annotation
VoteEligibilityCheckingService.destroy() :: @Override :: Programatic
VoteEligibilityCheckingService.voteDestroy() :: Declarative
*/
