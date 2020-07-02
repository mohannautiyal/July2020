package com.home;

public class Student {

	String StudentName;
	int Age;
	
	
	
	public Student(String studentName, int age) {
		super();
		StudentName = studentName;
		Age = age;
	}
	public String getStudentName() {
	   System.out.println("Student Name is " +StudentName);
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
}
