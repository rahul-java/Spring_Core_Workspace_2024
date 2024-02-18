package com.mea.comp;

public class Employee extends Person{

	private String company;
	private double salary;
	

	public Employee(String name, String address, AadharDetails aadhar, String company,double salary) {
		
		super(name, address, aadhar);
		System.out.println("Employee.Employee() :: 5-param-constructor");
		this.company=company;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Employee [company=" + company + ", salary=" + salary + "]";
	}
	
	
	
}
