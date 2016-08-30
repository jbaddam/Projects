package com.bootcamp.sumofmultiples;


import static org.junit.Assert.*;
import org.junit.Test;


/**
 * @author Jagan Reddy
 * Class to test sum of multiples for given range, against the sample data
 */
public class SumOfMultiplesTest {
	
	
	 SumOfMultiple s = new SumOfMultiple();//object of a class,to test its functionality 
		
	/*
	 * Method Tests for valid input and valid output
	 */
	@Test
	public void testSumOfMultiples() {
		
		int input = 10;
		int actual = s.printSumOfMultiples(input);
		int expected = 23;
		
		//checks whether actual and expected values are equal or not
		assertEquals(" Testing for input value 10", expected  , actual);
		
	}

	 
	/*
	 *Method Tests for valid input and invalid output
	 */
	@Test
	public void failedTestSumofMultiples() {
		
		int input = 1757;
		int actual = s.printSumOfMultiples(input);
		int expected = 7550;
		
		//checks whether actual and expected values are equal or not
		assertNotEquals(" Testing for input value 1757", expected , actual);
		
	}	
	
	
	/*
	 * Method Tests for invalid input and invalid output
	 */
	@Test(expected = NumberFormatException.class)
	public void ErrorTestSumofMultiples() {
		
		int input = Integer.parseInt("abc");
		int actual = s.printSumOfMultiples(input);
		int expected = 750235;
		
		//checks whether actual and expected values are equal or not
		assertEquals(" Testing Invalid type of input abc", expected , actual);
		
	}		
}
