package com.home.Java8Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerMapEx {

	public static void main(String[] args) {

    Map<Integer,String> studentDetails = new HashMap<Integer,String>();
    studentDetails.put(1, "Mohan");
    studentDetails.put(21, "Rajesh");
    studentDetails.put(12, "Birju");
    studentDetails.put(11, "Sonal");
    
    BiConsumer<Integer,String> mapoperations = (x,y) -> System.out.println(x+ "  "+y);
    studentDetails.forEach(mapoperations);

		
		
	}

}
