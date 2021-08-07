package com.techment.arrayfundamentaltask;

import java.util.*;
public class Excercise2 {

	public static void main(String[] args) {
		 int[] arr = new int[]{1,4,34,56,7}; //declaration & instantiating array- arr
		 boolean check = false;
		 int i;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter array element want to search: ");
		 int findNumber = scan.nextInt();
		 
		 //traversing the loop to search findNumber.
		 for( i =0 ;i< arr.length ; i++) {
			 if(arr[i] == findNumber) {    //if findNumber found then terminated the loop no need to go further.
				 check = true;
				 break;
			} else 
				 check = false;
			
		 }
		if(check )
		   System.out.println(i);
		else
			 System.out.println("-1");
	}

}
