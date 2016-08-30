package com.javabootcamp.corejava.matrix;



/**
 * @author Jagan Reddy
 *This calss contains all the data(i. e different Application servers versions and their Release years)
 *based on user input it will fetch and print the Data
 */
public class AppServers {
	
	static MetricUtilities m;

	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void glassFish(int years) {
		String glassFishInfo[][] = { { "GlassFish 1", "2007" }, { "GlassFish 1.1", "2007" },
				{ "GlassFish 2.1", "2009" }, { "GlassFish v3", "2009" }, { "GlassFish v3.1", "2011" },
				{ "GlassFish v3.1.1", "2011" }, { "GlassFish v3.1.2", "2012" }, { "GlassFish v3.1.2.2", "2012" },
				{ "GlassFish 4.0", "2013" }, { "GlassFish 4.1", "2014" }, { "GlassFish 4.1.1", "2015" } };
		
		System.out.println("\n" + years + " Years Data of GlassFish Server");

		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(glassFishInfo, years);

	}

	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void tomcatInfo(int years) {
		String tomcatInfo[][] = { { "Apache Tomcat5.0 ", "2004" }, { "Apache Tomcat4.1", "2009" },
				{ "Apache Tomcat5.5", "2012" }, { "Apache Tomcat6.0", "2016" }, { "Apache Tomcat7.0", "2016" },
				{ "Apache Tomcat8.0", "2016" }, { "Apache Tomcat8.5Beta", "2016" },
				{ "Apache Tomcat9.0alpha", "2016" } };
		
		System.out.println("\n" + years + " Years Data of Tomcat Server");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(tomcatInfo, years);

	}

	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void weblogicInfo(int years) {
		String weblogicInfo[][] = { { "WebLogic Server 9.0 ", "2006" }, { "WebLogic Server 10.0", "2007" },
				{ "WebLogic Server 10.3", "2008" }, { "WebLogic Server 11g(10.3.1)", "2009" },
				{ "WebLogic Server 11g(10.3.2) ", "2009" }, { "WebLogic Server 11g(10.3.3)", "2010" },
				{ "WebLogic Server 11g(10.3.4)", "2011" }, { "WebLogic Server 11g(10.3.5)", "2011" },
				{ "WebLogic Server 11g(10.3.6)", "2012" }, { "WebLogic Server 12c(12.1.1)", "2012" },
				{ "WebLogic Server 12c(12.1.2)", "2013" }, { "WebLogic Server 12c(12.1.3)", "2014" },
				{ "WebLogic Server 12c(12.2.1)", "2015" } };
		
		System.out.println("\n" + years + " Years Data of  Weblogic Server");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(weblogicInfo, years);
	}
}
