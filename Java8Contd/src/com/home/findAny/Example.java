package com.home.findAny;

import java.util.Arrays;
import java.util.List;

public class Example {
	
	
	public static void main(String[] args) {
		
		List<String> alphabets = Arrays.asList("AAC","BBD","CC","DDE");
		String find =alphabets.stream().filter(x -> x.length()==2).findAny().orElse(null);
		System.out.println(find);
		
	  alphabets.stream().filter(x -> x.length()==2).findAny().ifPresent(x->System.out.println(x));

		
	}

}
