package com.logicbuilding;

public class Exercise11Pattern {
//WAP to print pattern
	public static void main(String[] args) {
		int n = 5;
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}

}
