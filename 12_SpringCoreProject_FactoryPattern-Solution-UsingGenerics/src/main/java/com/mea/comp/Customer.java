package com.mea.comp;

public class Customer extends Person{
 
	private int txId;
	private double billAmount;

	public Customer(String name, String address, AadharDetails aadhar,int txId,double billAmount) {
		super(name, address, aadhar);
		System.out.println("Customer.Customer() :: 5-param-constructor");
		this.txId=txId;
		this.billAmount=billAmount;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Customer [txId=" + txId + ", billAmount=" + billAmount + "]";
	}
	
	
}
