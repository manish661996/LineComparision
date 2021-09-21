package com.bridgelabz.LineComparision;

import org.apache.logging.log4j.Logger;



import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
	public static void main( String[] args )
	{
		// this section of the code will generate log file and print log message on console
		String message="Welcome , your line will be evaluated shortly....";
		LOG.debug(message + " will be printed on Debug");
		LOG.info(message + " Will be printed on info");
		LOG.warn(message + " will be printed on warn");
		LOG.error(message + " will be printed on error");
		LOG.fatal(message + " will be printed on fatal");
		LOG.info("Appending String: {}.", message);
		System.out.println(message);
		//creating one object	to fulfill Use Case 1
		LineComparision l1 = new LineComparision();
		//setting values
		l1.setXi();
		l1.setXf();
		l1.setYi();
		l1.setYf();
		//calculating length of line
		l1.lengthOfLine();
		//display the length
		l1.display();

		//creating second object 
		LineComparision l2 = new LineComparision();
		//setting values
		l2.setXi();
		l2.setXf();
		l2.setYi();
		l2.setYf();
		//calculating length of line
		l2.lengthOfLine();

		//checking the equality of lines
		l2.equals(l1);

		//compairing which line is greator or smaller
		l1.compareTo(l2);
	}
}
