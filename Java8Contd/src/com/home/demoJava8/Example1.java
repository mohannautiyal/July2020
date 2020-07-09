package com.home.demoJava8;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		// find students whoose name has more than 5 chars		
		List<String> studentName = Arrays.asList("Rohan","Mohan","Anuj","Rajesh","Krish");		
		studentName.stream().filter(x -> x.length() > 5).forEach(x->System.out.println(x));
		
		
	}

}
