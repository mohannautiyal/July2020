package com.home.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.home.Student;

public class Example2Object {

	public static void main(String[] args) {


		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mohan",12));
		students.add(new Student("Sohan",11));
		students.add(new Student("Akhil",21));
		students.add(new Student("Brij",14));
		
		students.stream().sorted(Comparator.comparing(Student::getStudentName)).forEach(x ->System.out.println(x.getStudentName()));

	}

}
