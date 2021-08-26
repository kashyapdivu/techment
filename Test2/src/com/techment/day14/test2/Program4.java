package com.techment.day14.test2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		System.out.println("Select any one Traffic light ");
		
		System.out.println("1 : for  red"+"\n"+""
				+          "2: for Yellow"+"\n"+
				           "3: for Green.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter Choice:");
		int userEnter = scanner.nextInt();
		
		if(userEnter == 1)
			System.out.println("Stop");
		else if(userEnter == 2)
			System.out.println("Ready");
		else if(userEnter == 3)
			System.out.println("Go");
		
	
		
	}

}
