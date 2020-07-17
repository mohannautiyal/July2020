package com.home;

import java.util.Scanner;

public class RecursionReverseString {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a String : ");
       String enteredString = sc.next();
            
       System.out.println("Reversed String is " + reverseString(enteredString));
		
	}
	
	
	public static String reverseString(String Str) {
				
	 if(Str.length()>=1) {
		 return  Str.substring(Str.length()-1 , Str.length()) + reverseString(Str.substring(0, Str.length()-1));
		 
	 }else
		 return Str;
	}

}
