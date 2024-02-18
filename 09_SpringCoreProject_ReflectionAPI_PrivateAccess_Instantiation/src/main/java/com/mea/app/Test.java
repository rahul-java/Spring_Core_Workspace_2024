package com.mea.app;

public class Test {
	
	private int a;
	private int b;
	
	private Test() {
		System.out.println("Test.Test() ::: 0-param-constructor");
	}
	
	private Test(int a,int b) {
		System.out.println("Test.Test() ::: 2-param-constructor");
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	

}
