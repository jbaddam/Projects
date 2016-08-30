package com.bootcamp.corejava.test2;

import java.util.Scanner;

/**
 * @author Jagan Reddy 
 * class to reverse the given sentence words not words characters
 */

public class StringResverse {

	/*
	 * @param s takes string as input splits the given string
	 * @return reverse string
	 */
	static String reverse(String s) {
		String[] reverse = s.split(" ");
		String reverseString = "";
		
		for (int i = reverse.length - 1; i >= 0; i--) {
			reverseString += reverse[i] + " ";
		}
		return reverseString;
	}

	public static void main(String[] args) {
		System.out.print("Enter a sentence to reverse : ");
		Scanner sc = new Scanner(System.in);
		
		// accepting user input as string
		String s = sc.nextLine();
		sc.close();
		
		// storing the output given by reverse method
		String output = reverse(s);
		
		System.out.println("Reversed String is \n" + output);

	}
}
