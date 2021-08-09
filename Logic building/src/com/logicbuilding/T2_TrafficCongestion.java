package com.logicbuilding;

import java.time.*;
import java.time.DayOfWeek;
import java.util.Scanner;

public class T2_TrafficCongestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Day : ");
		String day = in.next();

		// System.out.println(getDayNumber(day));
		int dayIndex = getDayNumber(day);
		if (dayIndex == 0)
			System.out.println("Invalid input");
		else if (dayIndex % 2 == 0)
			System.out.println("Cars with even registration numbers are permitted today.");
		else
			System.out.println("Cars with odd registration numbers are permitted today.");
	}

	// Get the number for the day
	public static int getDayNumber(String day) {
		int dayNumber;
		switch (day) {
		case "Monday":
			dayNumber = 1;
			break;
		case "Tuesday":
			dayNumber = 2;
			break;
		case "Wednesday":
			dayNumber = 3;
			break;
		case "Thrusday":
			dayNumber = 4;
			break;
		case "Friday":
			dayNumber = 5;
			break;
		case "Saturday":
			dayNumber = 6;
			break;
		case "Sunday":
			dayNumber = 7;
			break;
		default:
			dayNumber = 0;
		}

		return dayNumber;
	}
}
