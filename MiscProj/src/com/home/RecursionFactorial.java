package com.home;

public class RecursionFactorial {

	public static void main(String[] args) {

		System.out.println(findFact(7));;
	}

	
	public static int findFact(int num) {

		if (num > 1) {
			return num * findFact(num - 1);
		}
		else

		return 1;

	}

}
