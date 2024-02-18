package com.mea.app;

import com.mea.comp.AadharDetails;
import com.mea.comp.Employee;
import com.mea.comp.Person;
import com.mea.comp.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		
		//create AadharDetails class obj
		AadharDetails details=new AadharDetails(12345L, 20, 956550L);
		
		Person employee=new Employee("rahul", "new delhi", details, "MEA-HQ", 45000.0);
		System.out.println(employee);
		
		System.out.println("=========================================================");
		
		AadharDetails details1=new AadharDetails(23456L, 30, 829955L);
		Person student=new Student("ram", "ayodhya", details1, 139, "SBMS");
		System.out.println(student);
		
		System.out.println("==========================================================");
		
		
	}
}
/*
AadharDetails.AadharDetails() :: 3-param-constructor
Person.Person() :: 3-param-constructor
Employee.Employee() :: 5-param-constructor
Person [name=rahul, address=new delhi, aadhar=AadharDetails [aadharNo=12345, age=20, mobileNo=956550]]Employee [company=MEA-HQ, salary=45000.0]
=========================================================
AadharDetails.AadharDetails() :: 3-param-constructor
Person.Person() :: 3-param-constructor
Student.Student() :: 5-param-constructor
Person [name=ram, address=ayodhya, aadhar=AadharDetails [aadharNo=23456, age=30, mobileNo=829955]]Student [rollNo=139, course=SBMS]
==========================================================*/
