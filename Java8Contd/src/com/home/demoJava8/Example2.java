package com.home.demoJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		// Given a list of numbers.. add the even numbers in one list and odd in another

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNum = new ArrayList<Integer>();
		evenNum =numbers.stream().filter(x ->x%2 ==0).collect(Collectors.toList());
		evenNum.forEach(System.out::println);

	}

}
