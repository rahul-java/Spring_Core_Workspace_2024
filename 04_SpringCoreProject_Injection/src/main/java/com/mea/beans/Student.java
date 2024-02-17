package com.mea.beans;

public class Student {
	
	private int sno;
	private String sname;
	private String sadd;
	private int sage;
	
	public Student(int sno, String sname, String sadd, int sage) {
		
		System.out.println("Student.Student() :: 4-param-constructor");
		
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.sage = sage;
	}
	
	

	public void setSno(int sno) {
		System.out.println("Student.setSno()");
		this.sno = sno;
	}



	public void setSname(String sname) {
		System.out.println("Student.setSname()");
		this.sname = sname;
	}



	public void setSadd(String sadd) {
		System.out.println("Student.setSadd()");
		this.sadd = sadd;
	}



	public void setSage(int sage) {
		System.out.println("Student.setSage()");
		this.sage = sage;
	}



	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", sage=" + sage + "]";
	}
	
	
	
	

}
