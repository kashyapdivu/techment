package com.techment.assignment1.oops;

import java.util.Scanner;

interface Polygon {
	
	void calcArea( );	//Method to calculate area 
	void calcPeri( ); 	//Method to calculate perimeter
	
}


class Square implements Polygon{
		float side ;

		
		

		public Square(float side) {
			super();
			this.side = side;
		}

		@Override
		public void calcArea() {
			System.out.println("Area of Square : "+ side * side);
		}

		@Override
		public void calcPeri() {
			System.out.println("Perimeter of Square : "+ 4 * side);	
		}
	
}

class Rectangle implements Polygon{
	float length ;
	float breadth ;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
  
      System.out.println("Area of Rectangle : "+ (length* breadth));
	}

	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Rectangle : "+ (2*(length + breadth)));
	}

}

public class Program6 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
     
	 System.out.println("Enter square side: ");
     int squareSide = scanner.nextInt();
	Square square = new Square(squareSide);		 // passing value through constructor
	square.calcArea();
		square.calcPeri();
	
		Rectangle rectangle = new Rectangle();
		 System.out.println("\nEnter length of rectangle: ");
	     int rectLength = scanner.nextInt();
	     System.out.println("Enter breadth of rectangle: ");
	     int rectBreadth = scanner.nextInt();
	    
	     rectangle.setLength(rectLength);  // set value through setter method
	     rectangle.setBreadth(rectBreadth);
	    
	     
	     rectangle.calcArea();
	     rectangle.calcPeri();
	
	}

}
