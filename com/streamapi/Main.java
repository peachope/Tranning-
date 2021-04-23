package com.streamapi;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> listStudent = new ArrayList<Student>();
		
		Student st1 = new Student(1,"Thanh","Female",23);
		Student st2 = new Student(2,"Thu","Male",23);
		Student st3 = new Student(3,"Tuan","Male",23);
		
		listStudent.add(st1);
		listStudent.add(st1);
		listStudent.add(st1);
		// gender == male
		listStudent.stream().filter(item -> item.getGender().equalsIgnoreCase("Male")== true).forEach(System.out::println);
		
		 long count = listStudent.stream().filter(item -> item.getAge() > 20).count();
	     System.out.printf("There are students with age >20", count);
	     
	    
	     
	}

}
