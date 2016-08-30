package com.javabootcamp.corejava.matrix;


/**
 * @author Jagan Reddy
 *This calss contains all the data(i. e Version of different Databases and their Release years)
 *based on user input it will fetch and print the Data
 */
public class DataBases {
	static MetricUtilities m;

	
	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void oracleInfo(int years) {
		String oracleInfo[][] = { { "Oracle 10g (10.1", "2006" }, { "Oracle 9i", "2007" },
				{ "Oracle 11g (11.1)", "2008" }, { "Oracle 10g (10.2)", "2010" },
				{ "Oracle 12c (12.1)", "2013" }, { "Oracle 11g (11.2)", "2013" },
				{ "Oracle 12c (12.1)", "2014" } };
		
		System.out.println("\n"+years+" Years Data of Oracle DataBase");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(oracleInfo, years);
	}

	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void mySqlInfo(int years) {
		String mySqlInfo[][] = { { "MySQL Beta Version 5.0", "2005" }, { "MySQL Version 5.1", "2008" },
				{ "MySQL Server 5.5", "2010" }, { "MySQL 5.6", "2013" }, { "MySQL 5.7", "2015" } };
		System.out.println("\n"+years+" Years Data of MySql Data Base");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(mySqlInfo, years);

	}
	
	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void sqlServerInfo(int years) {
		String sqlServerInfo[][] = { { "SQL Server 2005", "2005" }, { "SQL Server 2008", "2008" },
				{ "SQL Server 2008 Release 2", "2008" }, { "SQL Server 2012", "2012" }, { "SQL Server 2014", "2014" },
				{ "SQL Server 2016", "2016" }, };
		
		System.out.println("\n"+years+" Years Data of SQL Server Data Base");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(sqlServerInfo, years);

	}

}
