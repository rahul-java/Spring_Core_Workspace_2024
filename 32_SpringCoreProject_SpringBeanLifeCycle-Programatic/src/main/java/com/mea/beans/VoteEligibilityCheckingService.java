package com.mea.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoteEligibilityCheckingService implements InitializingBean, DisposableBean{

	private String name;
	private int age;
	private Date verifiedOn;
	
	public VoteEligibilityCheckingService() {
		System.out.println("VoteEligibilityCheckingService.VoteEligibilityCheckingService() :: 0-param-constructor");
	}
	
	
	public void setName(String name) {
	
		System.out.println("VoteEligibilityCheckingService.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VoteEligibilityCheckingService.setAge()");
		this.age = age;
	}
	
	//init life cycle method
	/*
	public void voteInit()
	{
		System.out.println("VoteEligibilityCheckingService.voteInit()");
		verifiedOn=new Date(); //initialization of left over property
		
		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid Inputs name/age");
	}
	*/
	
	//destroy life cycle
	/*
	public void voteDestroy() {
		System.out.println("VoteEligibilityCheckingService.voteDestroy()");
		name=null;
		age=0;
		verifiedOn=null;
	}
	*/
	
	//b.method
	public String checkVotingEligibility() {
		System.out.println("VoteEligibilityCheckingService.checkVotingEligibility() :: "+verifiedOn); 
		
		if(age>=18)
			return "Mr./Ms./Mrs. "+name+" , You are eligible for voting.";
		else
    		return "Mr./Ms./Mrs. "+name+" , You are not eligible for voting.";
	}


	//destroy() -- destroy life cycle method
	@Override
	public void destroy() throws Exception {
		System.out.println("VoteEligibilityCheckingService.destroy()");
		name=null;
		age=0;
		verifiedOn=null;
	}


	//afterPropertiesSet() --init life cycle method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoteEligibilityCheckingService.afterPropertiesSet()");
		verifiedOn=new Date(); //initialization of left over property
		
		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid Inputs name/age");
	}
}
