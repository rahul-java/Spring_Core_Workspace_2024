package com.mea.beans;

public class A {
	
	private B b;
	
	
	public A(B b) {

		this.b=b;
		System.out.println("A.A() :: 1-param-contructor");
	}
	
	/*public A() {
	
		System.out.println("A.A() ::: 0-param-constructor");
	}
	
	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}*/

	@Override
	public String toString() {
		return "A [b= ]";
		//return "A [b=" + b + "]";
	}
	
	

}
