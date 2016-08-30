package com.javabootcamp.corejava.matrix;


/**
 * @author Jagan Reddy
 * This class contains the comman code to print the data of 2D array for given input years
 */
public class MetricUtilities {

	/*
	 * @param input
	 * @param years
	 * print the data of 2D array for given input years
	 */
	static void printInfo(String[][] input, int years) {
		
		if (years <= 10) {

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
					+ "~~~\nVersion\t\t\t\t Release Year\n~~~~~~~~~~~~~~~~~~~"
					+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < input[i].length; j++) {
                  /*conversting the second entry of data in each set of data in 2D array to integer
                   *  and checking wether it is less than are years*/
					if (Integer.parseInt(input[i][1].trim()) >= (2016 - years))
						
						//prints the in 2D array if condition true
						System.out.printf("%-40s", input[i][j].trim());

				}
				System.out.println();

			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		} else
			System.out.println("\nOh No ! I have only 10 years Information");
	}

}
