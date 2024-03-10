package com.mea.service;

public class BankService {

	public double calcInterestAmount(double pAmt,double rate,double time) {
		
		System.out.println("BankService.calcInterestAmount() :: Compound-Interest");
		//calculate compound interest
		return (pAmt*Math.pow(1+rate/100, time))-pAmt;
	}
}
