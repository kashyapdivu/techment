package com.techment.session;

public class Pattern3 {
	public static void main(String[] args) {
		int i, j, row = 4;

		for (i = 0; i < row; i++) {
			for (j = 0; j < row; j++) {
				if (i == 0 || i == row-1 || j == 0 || j == row-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
