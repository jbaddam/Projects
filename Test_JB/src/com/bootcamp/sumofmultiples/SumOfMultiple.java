package com.bootcamp.sumofmultiples;

import java.util.Scanner;

public class SumOfMultiple {
	
	

	public static void main(String[] abc) {
		System.out.println("Enter the Number Range ");
		int n=new Scanner(System.in).nextInt();		
		int a=printSumOfMultiples(n);
		System.out.println("Sum of mulptiple of 5 & 3 Below  is "+a);
		

	}
	// Method prints sum of multiples of 3 & 5 below the given range
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
