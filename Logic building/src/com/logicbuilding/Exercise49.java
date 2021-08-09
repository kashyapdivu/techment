package com.logicbuilding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * Program to find age from dob.
 */
public class Exercise49 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner =  new Scanner(System.in);
		 System.out.println("Enter your DOB(Format:YYYY/MM/DD) : ");
		String dob = scanner.next();
		Date date = new SimpleDateFormat("yyyy/MM/dd").parse(dob);  
		   // String strDate= formatter.format(date);  
		    System.out.println("Date of Bith is : "+dob);  
	
		    Calendar c = Calendar.getInstance();
		    c.setTime(date);
		    int day = c.get(Calendar.DAY_OF_YEAR);
	System.out.println(day);
	}  
}  
