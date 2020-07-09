package com.home.demoJava8;

import java.util.ArrayList;
import java.util.List;

import com.home.Student;

public class Example3 {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mohan",12));
		students.add(new Student("Kavish",25));
		students.add(new Student("Rajesh",30));
		students.add(new Student("Tanmay",16));
		
		// find if student with name Mohan exists
		boolean findStudent = students.stream().anyMatch(x -> x.getStudentName().equals("Mohan"));
		System.out.println(findStudent);

	}

}
