package com.bootcampjava.electricityservice.utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Jagan Reddy
 * This class has behavior to read the properties file
 */
public class PropertiesUtility {

	
	/**
	 * @return
	 * This method returns the Properties object after reading and loading the Properties file
	 */
	public Properties getProperies() {
		
		Properties properties = new Properties();
		InputStream file = null;
		
		//getting the properties file path from tomcat conf directory
		String path = System.getenv("CATALINA_HOME")+"\\conf"+"\\config.properties";
		
		try {
			file = new FileInputStream(path);
			
		} catch (FileNotFoundException e2) {
			System.out.println("Unable to find  properties file");
			e2.printStackTrace();
		}
		try {
			
			//loading data from properties file to Properties object
			properties.load(file);
			file.close();
		} catch (IOException e1) {
			System.out.println("Unable to load  properties file");
			e1.printStackTrace();
		}
		
		return properties;
	}

}
