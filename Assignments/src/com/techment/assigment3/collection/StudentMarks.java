package com.techment.assigment3.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {

		System.out.println("Enter number of Students:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int temp, sum = 0;
		float average;
		ArrayList<Integer> student = new ArrayList<Integer>();

		System.out.println("Enter Marks:");
		System.out.println("-------------------------");
		for (int i = 0; i < number; i++) {
			temp = scan.nextInt();
			student.add(temp);
		}

		// System.out.println(" Highest Marks ");
		int max = student.get(0);
		for (int i = 1; i < number; i++) {
			if (student.get(i) > max) {
				max = student.get(i);
			}
		}
		System.out.println("Highest marks : " + max);

		// System.out.println(" Average Marks ");
		for (Integer avg : student) {
			sum += avg;
		}
		average = sum / number;
		System.out.println("Average marks : " + average);

		System.out.print("Marks: ");
		int i = 1,j=1;
		for (Integer marks : student) {
			System.out.print(i + "-" + marks + "\t");
			i++;
		}

		int pos = student.get(2);
		System.out.println("\n3rd Student marks :-" + pos);

		Collections.sort(student);
		System.out.print("Sorted 	: ");
		for (Integer marks : student) {
            System.out.print(j + "-" + marks + "\t");
			j++;

		}
	}
}
