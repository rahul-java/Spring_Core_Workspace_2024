package com.mea.comp;

public class Student extends Person{

	private int rollNo;
	private String course;

	public Student(String name, String address, AadharDetails aadhar,int rollNo,String course) {
		super(name, address, aadhar);
		System.out.println("Student.Student() :: 5-param-constructor");
		this.rollNo=rollNo;
		this.course=course;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Student [rollNo=" + rollNo + ", course=" + course + "]";
	}
}
