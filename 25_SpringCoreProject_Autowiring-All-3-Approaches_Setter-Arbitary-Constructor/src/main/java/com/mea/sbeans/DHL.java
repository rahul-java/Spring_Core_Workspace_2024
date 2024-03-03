package com.mea.sbeans;

public final class DHL implements Courier {

	
	public DHL() {

		System.out.println("DHL.DHL() :: 0-param-constructor");
	}
	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order id Order assigned to DHL";
	}

}
