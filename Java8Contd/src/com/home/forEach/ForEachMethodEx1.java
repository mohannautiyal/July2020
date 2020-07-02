package com.home.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodEx1 {

	/*
	 * forEach() method performs an action for each element of this stream. For
	 * parallel stream, this operation does not guarantee to maintain order of the
	 * stream.
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
		
		studentName.forEach(x -> System.out.println(x));
		
		
	}

}
