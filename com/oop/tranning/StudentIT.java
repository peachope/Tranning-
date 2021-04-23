package com.oop.tranning;

import java.util.Scanner;

public class StudentIT extends Student {
	
	private float diemJava,diemHTML;
	

	public float getDiemJava() {
		return diemJava;
	}
 

	public void setDiemJava(float diemJava) {
		this.diemJava = diemJava;
	}


	public float getDiemHTML() {
		return diemHTML;
	}


	public void setDiemHTML(float diemHTML) {
		this.diemHTML = diemHTML;
	}


	public StudentIT(String className, int idStudent, float markMath, float markHis) {
		super(className, idStudent);
		// TODO Auto-generated constructor stub
	}
   

	@Override
	public float getAverage() {
		
		return (diemJava+diemHTML)/2;
	}


	@Override
	public void setStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten lop - nhap ma sinh vien - nhap diem java - nhap diem html");		
		super.setClassName(String.valueOf(sc.nextLine()));		
		super.setIdStudent (sc.nextInt()); sc.nextLine();
		this.setDiemJava(sc.nextFloat());sc.nextLine();
		this.setDiemHTML(sc.nextFloat());
		
		
	}
	@Override 
	public void getStudent() {
		
		System.out.println("Sinh vien IT truong Buu chinh");
	}
	
	
	
        
}
