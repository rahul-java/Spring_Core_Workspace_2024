package com.mea.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalcInterestAmountReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

		System.out.println("CalcInterestAmountReplacer.reimplement() :: Simple-Interest");
		//get target method args value
		double pAmt=(double)args[0];
		double rate=(double)args[1];
		double time=(double)args[2];
		
		//write new logic to cal simple interest
		return pAmt*rate*time/100;
	}

}
