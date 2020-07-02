package com.home.forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import com.home.Student;

public class ForEachMethodEx4 {

	public static void main(String[] args) {

		BiConsumer<Integer,Student> studentBiConsumer = (k,y)->{
			System.out.println(k+" "+ y.getStudentName());
		};
		
		Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
		studentMap.put(1, new Student("Mohan",123));
		studentMap.put(2, new Student("Sohan",223));
		studentMap.put(3, new Student("Kiran",323));
		
		studentMap.forEach(studentBiConsumer);


	}

}
