package com.javabootcamp.corejava.matrix;


/**
 * @author Jagan Reddy
 *This calss contains all the data(i. e different IDE versions and their Release years)
 *based on user input it will fetch and print the Data
 */
public class IDEs {
	
	static MetricUtilities m ;

	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void eclipseInfo(int years) {
		String[][] eclipseInfo = { { "Callisto3.2", "2006" }, { "Europa3.3", "2007" }, { "Ganymede3.4", "2008" },
				{ "Galileo3.5", "2009" }, { "Helios3.6", "2010" }, { "Indigo3.7", "2011" }, { "Juno4.2", "2012" },
				{ "Kepler4.3", "2013" }, { "Luna4.4", "2014" }, { "Mars4.5", "2015" }, { "Neon4.6", "2016" }, };
		
		System.out.println("\n"+years+" Years Data of Eclipse IDE");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(eclipseInfo, years);

	}

	
	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void netBeansInfo(int years) {
		String[][] netBeansInfo = { { "Net Beans 5.0", "2006" }, { "Net Beans 5.5", "2007" },
				{ "Net Beans 6.0", "2008" }, { "Net Beans 6.5", "2009" }, { "Net Beans 6.8", "2010" },
				{ "Net Beans 6.9", "2011" }, { "Net Beans 7.0", "2012" }, { "Net Beans 7.2", "2013" },
				{ "Net Beans 8.0", "2014" }, { "Net Beans 8.1", "2015" }, };
		
		System.out.println("\n"+years+" Years Data of NetBeans IDE");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(netBeansInfo, years);

	}

	
	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void intelliJInfo(int years) {

		String[][] intelliJInfo = { { "IntelliJ Idea 6", "2006" }, { "IntelliJ Idea 7", "2007" },
				{ "IntelliJ Idea 7", "2008" }, { "IntelliJ Idea 8", "2009" }, { "IntelliJ Idea 10", "2010" },
				{ "IntelliJ Idea 10.5", "2011" }, { "IntelliJ Idea 11", "2012" }, { "IntelliJ Idea 12", "2012" },
				{ "IntelliJ Idea 13", "2013" }, { "IntelliJ Idea 14", "2014" }, { "IntelliJ Idea 15", "2015" } };
		
		System.out.println("\n"+years+" Years Data of IntelliJ IDE");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(intelliJInfo, years);

	}

}
