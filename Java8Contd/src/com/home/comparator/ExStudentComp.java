package com.home.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.home.Student;

public class ExStudentComp {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mohan",12));
		students.add(new Student("Kavish",25));
		students.add(new Student("Rajesh",30));
		students.add(new Student("Tanmay",16));
		students.stream().forEach(x ->System.out.println(x));
		Collections.sort(students, (s1,s2)-> s1.getStudentName().compareTo(s2.getStudentName()));
		System.out.println("============After sorting using comparator===========");
		students.stream().forEach(x ->System.out.println(x));
		
		System.out.println("============After sorting using age comparator===========");
        students.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);


	}

}
