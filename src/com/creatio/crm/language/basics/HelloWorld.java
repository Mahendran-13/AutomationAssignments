package com.creatio.crm.language.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		//print the data and move to next line
		System.out.println("Hello Automation");//syso+space

		//print the data and stay in the line
		System.out.print("Hello Autonation");
		
		System.out.println();
		
		
		//print the statement with specific format
		System.out.printf("My name is %s and my age is %d.%n" ,"mahendran" ,26);
		
		
		//print the char based on ASCII value
		System.out.write(65);
		System.out.println("test");
		
		
		//print the error
		System.err.println("Error occured while login");
		
		//print theinformation with timer
		Logger.getLogger("Mylogger").info("message occor while login");
	}
	
	

}
