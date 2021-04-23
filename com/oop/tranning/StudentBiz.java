package com.oop.tranning;

import java.util.Scanner;

public class StudentBiz extends Student{
	 private float diemKT;
	 private float diemQT;
	 
	public StudentBiz(String className, int idStudent, float diemKT, float diemQT) {
		super(className, idStudent);
		this.diemKT = diemKT;
		this.diemQT = diemQT;
	}

	public float getDiemKT() {
		return diemKT;
	}

	public void setDiemKT(float diemKT) {
		this.diemKT = diemKT;
	}

	public float getDiemQT() {
		return diemQT;
	}

	public void setDiemQT(float diemQT) {
		this.diemQT = diemQT;
	}

	public StudentBiz(String className, int idStudent) {
		super(className, idStudent);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public float getAverage() {
		
		return (diemKT+diemQT)/2;
	}

	@Override
	public void setStudent() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten lop - nhap ma sinh vien - nhap diem KT - nhap diem QT");		
		super.setClassName(String.valueOf(sc.nextLine()));		
		super.setIdStudent (sc.nextInt());
		this.setDiemQT(sc.nextFloat());
		this.setDiemKT(sc.nextFloat());
	}
	@Override 
	public void getStudent() {
		
		System.out.println("Sinh vien Kinh Te truong Buu chinh");
	}
	

}
