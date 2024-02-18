package com.mea.factory;

import com.mea.comp.AadharDetails;
import com.mea.comp.Customer;
import com.mea.comp.Employee;
import com.mea.comp.Person;
import com.mea.comp.Student;

public class PersonFactory {
	
	//static factory method - having generic/common return type
	public static Person getPerson(String type)
	{
		Person person=null;
		AadharDetails details=null;
		
		if(type.equalsIgnoreCase("emp"))
		{
			details=new AadharDetails(12345L, 20, 829955L);
			person=new Employee("raja", "new delhi", details, "HCL", 56099.0);
		}
		else if(type.equalsIgnoreCase("cust"))
		{
			details=new AadharDetails(23456L, 30, 829966L);
			person=new Customer("ravi", "Sultanpur", details, 1234, 9099.0);
		}
		else if(type.equalsIgnoreCase("stud"))
		{
			details=new AadharDetails(34567L, 22, 829977L);
			person=new Student("manish", "dubai", details,139,"JAVA");
		}
		else {
			throw new IllegalArgumentException("Invalid Person Type");
		}
		return person;
	}

}
