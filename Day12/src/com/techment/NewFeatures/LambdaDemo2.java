package com.techment.NewFeatures;

interface Calculation {
	int add(int a, int b);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Calculation calculation = (a, b) -> a + b;
		System.out.println(calculation.add(2, 3));

		Calculation calculation2 = (a, b) -> {
			if (a > b)
				return a;
			return b;
		};

		System.out.println(calculation2.add(10, 20));
	}

}
