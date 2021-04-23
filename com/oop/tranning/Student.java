package com.oop.tranning;

import java.util.Scanner;

abstract class Student  {

	private String className ;
	private int idStudent;
	
	
	
	
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	
	
	public Student(String className, int idStudent) {
		super();
		this.className = className;
		this.idStudent = idStudent;
		
	}
	
	abstract public float getAverage();
	abstract public void  setStudent();
	public void getStudent() {
		
		System.out.println("Sinh vien truong Buu chinh");
		System.out.println("Sinh vien lop "+this.getClassName()+" MSSV:" +this.getIdStudent()+" DTB :" +this.getAverage());
		
	}
	
	
     
}
