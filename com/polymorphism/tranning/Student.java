package com.polymorphism.tranning;

import java.util.Scanner;

public class Student extends Person{
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String gender, int age, String name) {
		super(gender, age, name);
		// TODO Auto-generated constructor stub
	}

	public Student(String major) {
		super();
		this.major = major;
	}
	@Override 
	 public void setPerson() {
   	 Scanner sc = new Scanner(System.in);
   	 System.out.println("Nhap vao ho ten: ");
   	 this.setName(sc.nextLine());
   	 System.out.println("Nhap vao gioi tinh: ");
   	 this.setGender(sc.nextLine());
   	 System.out.println("Nhap vao tuoi: ");
   	 this.setAge(sc.nextInt()); sc.nextLine();
	 System.out.println("Nhap vao nghe nghiep: ");
   	 this.setMajor(sc.nextLine());
   	 
    }
	@Override
   public void getPerson() {
		System.out.println("================================");
   	System.out.println("Thong tin sinh vien");
   	System.out.println("Ho ten: " +this.getName()); 
   	System.out.println("Gioi tinh: " +this.getGender()); 
   	System.out.println("Tuoi: " +this.getAge()); 
	   System.out.println("Nghe nghiep: Sinh vien"); 
   	
   	
   }
}
