package com.logicbuilding;

public class Exercise36 {

	public static void main(String[] args) {
       
		 for (int i = 5, x = 0; i >= 1; i--, x += 2) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.print(' ');
	            for (int k = i; k >= 1; k--) {
	                System.out.print(k);
	            }
	             System.out.println();
	        }
	    }
	}