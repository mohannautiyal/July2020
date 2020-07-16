package com.home;

public class Recursion1 {

	public static void main(String[] args) {

		System.out.println(sumNum(10));
		
		
	}

	public static int sumNum(int n) {

		if (n > 0) {
			
			return n + sumNum(n - 1);
		}

		return 0;
	}
}
