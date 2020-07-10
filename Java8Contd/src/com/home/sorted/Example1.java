package com.home.sorted;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Mohan","Raj","Viraj","Ambika");
		
		students.stream().sorted().forEach(System.out::println);
	}
	
	
}
