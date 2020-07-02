package com.hom.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Example1 {

	public static void main(String[] args) {
     List<String> studentName = new ArrayList<String>();
		
		studentName.add("Mohan");
		studentName.add("Raj");
		studentName.add("Sohan");
		studentName.add("Brij");
		studentName.add("Tanishq");
		studentName.add("Hailey");
		studentName.add("Nina");
		
		BiFunction<String,String,String> biFunction = (a,b)-> a.concat(b);
	}

}
