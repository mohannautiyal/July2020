package com.home;

import java.util.Scanner;

public class RecursionFindLength {

	public static void main(String[] args) {

		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		
        System.out.println("\nEntered number is "+num);
        
        System.out.println("Length of Entered Number is "+findLength(num));
	}
	
	
	public static int findLength(int num) {
		
		if(num%10!=0) {
			return 1+ findLength(num/10);
		}
			else
			return 0;		
		
	}
	
	

}
