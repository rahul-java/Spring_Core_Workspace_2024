package com.mea.beans;

public class B {
	
	private A a;

	
	
	public B(A a) {

		this.a=a;
		System.out.println("B.B()  :: 1-param-constructor");
	}
	
	/*public B() {
	
	System.out.println("B.B()  ::: 0-param-constructor");
	}
	
	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}*/

	@Override
	public String toString() {
		//return "B [a=" + a + "]";
		return "B [a= ]";
	}
	
	

}
