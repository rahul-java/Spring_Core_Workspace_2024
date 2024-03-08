package com.mea.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component("voting")
//@PropertySource(value = "com/mea/commons/Info.properties")
public class VoteEligibilityCheckingService implements InitializingBean,DisposableBean  {
	
	//@Value("${voter.name}")
	private String name;
	
	//@Value("${voter.age}")
	private  int age;
	
	private  Date verifiedOn;
	
	public VoteEligibilityCheckingService() {
		System.out.println("VoteElgibilityCheckingService:: 0-param constructor");
	}
	
	public void setName(String name) {
		System.out.println("VoteElgibilityCheckingService.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VoteElgibilityCheckingService.setAge()");
		this.age = age;
	}
	
	//init life cycle method
		public void voteInit()
		{
			System.out.println("VoteEligibilityCheckingService.voteInit() :: Declarative");
			verifiedOn=new Date(); //initialization of left over property
			
			if(name==null || age<=0)
				throw new IllegalArgumentException("Invalid Inputs name/age");
		}
		
		//destroy life cycle
		public void voteDestroy() {
			System.out.println("VoteEligibilityCheckingService.voteDestroy() :: Declarative");
			name=null;
			age=0;
			verifiedOn=null;
		}
		
	
	//init life cycle method
	@PostConstruct
	public void myVoteInit()
	{
		System.out.println("VoteEligibilityCheckingService.myVoteInit() :: @PostConstruct :: Annotation");
		verifiedOn=new Date(); //initialization of left over property
		
		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid Inputs name/age");
	}
	
	
	// destroy life cycle method
	@PreDestroy
	public void myVoteDestroy() {
		System.out.println("VoteEligibilityCheckingService.myVoteDestroy() :: @PreDestroy :: Annotation");
		name=null;
		age=0;
		verifiedOn=null;
	}
	
	
	//b.method
	public  String checkVotingEligibility() {
		System.out.println("VoteElgibilityCheckingService.checkVotingElgibility()::"+verifiedOn);
		if(age>=18)
			return "Mr./Miss/Mrs. "+name +" your  elgible for Voting";
		else 
			return "Master. "+name +" your not  elgible for Voting";
	}

	//destroy() -- destroy life cycle method
		@Override
		public void destroy() throws Exception {
			System.out.println("VoteEligibilityCheckingService.destroy() :: @Override :: Programatic");
			name=null;
			age=0;
			verifiedOn=null;
		}


		//afterPropertiesSet() --init life cycle method
		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("VoteEligibilityCheckingService.afterPropertiesSet() :: @Override :: Programatic");
			verifiedOn=new Date(); //initialization of left over property
			
			if(name==null || age<=0)
				throw new IllegalArgumentException("Invalid Inputs name/age");
		}
	
}
