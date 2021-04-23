package com.polymorphism.tranning;

import java.util.Scanner;

public class Person {
      private String gender;
      private int age;
      private String name;
      
      
	public Person() {
	
	}
	public Person(String gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
      
     public void setPerson() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Nhap vao ho ten: ");
    	 this.setName(sc.nextLine());
    	 System.out.println("Nhap vao gioi tinh: ");
    	 this.setGender(sc.nextLine());
    	 System.out.println("Nhap vao tuoi: ");
    	 this.setAge(sc.nextInt());
     }
    public void getPerson() {
    	System.out.println("Thong tin ");
    	System.out.println("Ho ten: " +this.getName()); 
    	System.out.println("Gioi tinh: " +this.getGender()); 
    	System.out.println("Tuoi: " +this.getAge()); 
    	
    }
      
}
