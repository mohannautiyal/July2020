package com.home.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.home.Student;

public class ForEachMethodEx3 {

	public static void main(String[] args) {

		/*
		 * It represents a function which takes in one argument and produces a result.
		 * However these kind of functions don’t return any value.
		 */
		
		Consumer<Student> ageConsumer = x -> {if (x.getAge() > 10)
			 x.getStudentName();
		};
		
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mohan",12));
		students.add(new Student("Rohan",10));
		students.add(new Student("Kiran",11));
		students.add(new Student("Vijay",5));
		
		students.stream().forEach(ageConsumer);
		System.out.println("===========================");
		students.stream().forEach(Student::getStudentName);

		
		
	}

}
