package com.home.Java8Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class biConsumer {

	public static void main(String[] args) {

   BiConsumer<String,String> biConsumer1 = (x,y) -> System.out.println(x+" "+y);
   biConsumer1.accept("Madan", "Mohan");

   
   // Add one list into another filtering the even numbers
	  
	  List numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	  List<Integer> evenNum = new ArrayList<Integer>();
	  
	  BiConsumer<List<Integer>,List<Integer>> even = (x,y) -> {
		  	x.stream().filter(z -> (z%2 ==0)).forEach(z ->y.add(z));
			      
	  };
	  
	  even.accept(numbers, evenNum);
	  System.out.println(evenNum);
   
	}

}
