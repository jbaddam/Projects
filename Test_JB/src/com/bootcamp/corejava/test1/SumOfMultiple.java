package com.bootcamp.corejava.test1;


import java.util.Scanner;

/**
 * @author Jagan Reddy
 * Class has functionality to print sum of multiples of 3 & 5 for given range
 */
public class SumOfMultiple {
	
	public static void main(String[] abc) {
		
		System.out.println( "Enter the Number Range ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		sc.close();
		
		int a = printSumOfMultiples(n);
		
		System.out.println("Sum of mulptiple of 5 & 3 Below  is " + a);
		
	}
	
	
	/*
	 *  Method returns sum of multiples of 3 & 5 below the given range
	 */
	static int printSumOfMultiples(int sumofmultiplerange){
		int sum = 0;
		for (int i = 0; i < sumofmultiplerange; i++) {
			if(i%3==0||i%5==0){
				sum+=i;
			}			
		}
		return sum;		
	}

}
