package com.home.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.home.Student;

public class MapExample2 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mohan",12));
		students.add(new Student("Rohan",10));
		students.add(new Student("Kiran",11));
		students.add(new Student("Vijay",5));
		
			List<String> studentNames =students.stream().map(x->x.getStudentName()).collect(Collectors.toList());
			studentNames.stream().forEach(x->System.out.println(x));
	
	}

}
