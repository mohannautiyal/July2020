package com.home.Java8Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class consumerEx {

	public static void main(String[] args) {

       Consumer<String> con1 = (x) ->System.out.println(x.toUpperCase()) ;
	   con1.accept("Hello How Are You");
	   
	   List<String> studentNames = Arrays.asList("Mohan","Rohan","Kavita","Rajesh");
	   List<String> studentsInUpeerCase =studentNames.stream().map(x ->x.toUpperCase()).collect(Collectors.toList());
	
	  studentsInUpeerCase.forEach(x ->System.out.println(x));
	  
	  
	 
	  
	  
	}

}
