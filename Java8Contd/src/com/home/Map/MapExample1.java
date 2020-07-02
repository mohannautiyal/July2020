package com.home.Map;

import java.util.ArrayList;
import java.util.List;

public class MapExample1 {

	
	/*
	 * 
	 * The map() function is a method in the Stream class that represents a
	 * functional programming concept. In simple words, the map() is used to
	 * transform one object into other by applying a function
	 */
	public static void main(String[] args) {

		List<String> studentName = new ArrayList<String>();

		studentName.add("Mohan");
		studentName.add("Raj");
		studentName.add("Sohan");
		studentName.add("Brij");
		studentName.add("Tanishq");
		studentName.add("Hailey");
		studentName.add("Nina");
		
		studentName.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		
	}

}
