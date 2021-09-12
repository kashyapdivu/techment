package com.logicbuilding;

import java.util.Arrays;
import java.util.Collections;

public class Exercise13 {
	public static void main(String[] args) {

		Integer[] Product = { 23, 1, 3, 45, 7 };
		Arrays.sort(Product, Collections.reverseOrder());
		System.out.print(Product[0]);

	}

}
