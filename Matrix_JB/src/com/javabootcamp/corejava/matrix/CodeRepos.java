package com.javabootcamp.corejava.matrix;


/**
 * @author Jagan Reddy
 *This calss contains all the data(i. e different Source code Repositories versions and their Release years)
 *based on user input it will fetch and print the Data
 */
public class CodeRepos {
	static MetricUtilities m ;

	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void svnInfo(int years) {
		String svnInfo[][] = { { "SVN 1.4", "2006" }, { "SVN 1.5", "2008" }, { "SVN 1.6", "2009" },
				{ "SVN 1.7", "2011" }, { "SVN 1.8", "2013" }, { "SVN 1.9", "2015" } };
		
		System.out.println("\n"+years+" Years Data of SVN Version Control");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(svnInfo, years);

	}

	/*
	 * @param years 
	 * fetching and printing the data for given input year
	 */
	static void gitInfo(int years) {
		String gitInfo[][] = { { "GIT 0.99", "2005" }, { "GIT 1", "2006" }, { "GIT 1.1", "2006" },
				{ "GIT 1.2", "2006" }, { "GIT 1.3", "2006" }, { "GIT 1.4", "2008" }, { "GIT 1.5", "2008" },
				{ "GIT 1.6", "2010" }, { "GIT 1.7", "2012" }, { "GIT 1.8", "2014" }, { "GIT 1.9", "2014" },
				{ "GIT 2", "2014" }, { "GIT 2.1", "2014" }, { "GIT 2.2", "2015" }, { "GIT 2.3", "2015" },
				{ "GIT 2.4", "2016" }, { "GIT 2.5", "2016" }, { "GIT 2.6", "2016" }, { "GIT 2.7", "2016" },
				{ "GIT 2.8", "2016" }, { "GIT 2.9", "2016" }, };
		
		System.out.println("\n"+years+" Years Data of Git Hub Version Control");
		
		//calling printInfo() Method from MetricUtilities class
		MetricUtilities.printInfo(gitInfo, years);
	}

}
