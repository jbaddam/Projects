package com.javabootcamp.corejava.matrix;


/**
 * @author Jagan Reddy
 *This calss contains all the data(i. e different JDK versions and their Release years)
 *based on user input it will fetch and print the Data
 */
public class JDKs {
	
	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static MetricUtilities m ;

	static void jdkInfo(int years) {
		String[][] jdkInfo = { { "Java SE 6	", "2006" }, { "Java SE 7	", "2011" }, { "Java SE 8", "2014" } };
		
		System.out.println("\n"+years+" Years Data of Java Developement Kit(JDK)");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(jdkInfo, years);

	}

}
