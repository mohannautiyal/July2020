package com.home.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodEx2 {

	/*
	 * forEachOrdered() method performs an action for each element of this stream,
	 * guaranteeing that each element is processed in encounter order for streams
	 * that have a defined encounter order.
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
		
		//studentName.parallelStream().forEach(x->System.out.println(x));

		studentName.parallelStream().forEachOrdered(x -> System.out.println(x));
		
		
	}

}
