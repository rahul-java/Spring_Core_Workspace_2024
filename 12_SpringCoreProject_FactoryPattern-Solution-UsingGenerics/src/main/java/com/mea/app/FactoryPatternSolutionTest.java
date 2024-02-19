package com.mea.app;

import com.mea.comp.Customer;
import com.mea.comp.Employee;
import com.mea.comp.Person;
import com.mea.factory.PersonFactory;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
		
		try {
		//use Factory to create Employee Obj
		Person employee = PersonFactory.getPerson(Employee.class);
		System.out.println(employee);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=========================================================");
		
		try {
		Person customer = PersonFactory.getPerson(Customer.class);
		System.out.println(customer);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("==========================================================");
		
		
	}
}

/*
AadharDetails.AadharDetails() :: 3-param-constructor
Person.Person() :: 3-param-constructor
Employee.Employee() :: 5-param-constructor
Person [name=raja, address=new delhi, aadhar=AadharDetails [aadharNo=12345, age=20, mobileNo=829955]]Employee [company=HCL, salary=56099.0]
=========================================================
AadharDetails.AadharDetails() :: 3-param-constructor
Person.Person() :: 3-param-constructor
Customer.Customer() :: 5-param-constructor
Person [name=ravi, address=Sultanpur, aadhar=AadharDetails [aadharNo=23456, age=30, mobileNo=829966]]Customer [txId=1234, billAmount=9099.0]
==========================================================*/
/*
AadharDetails.AadharDetails() :: 3-param-constructor
Person.Person() :: 3-param-constructor
Employee.Employee() :: 5-param-constructor
Person [name=raja, address=new delhi, aadhar=AadharDetails [aadharNo=12345, age=20, mobileNo=829955]]Employee [company=HCL, salary=56099.0]
=========================================================
AadharDetails.AadharDetails() :: 3-param-constructor
Person.Person() :: 3-param-constructor
Customer.Customer() :: 5-param-constructor
Person [name=ravi, address=Sultanpur, aadhar=AadharDetails [aadharNo=23456, age=30, mobileNo=829966]]Customer [txId=1234, billAmount=9099.0]
==========================================================
*/
