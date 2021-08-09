package com.logicbuilding;

import java.util.Scanner;

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	void displayProduct() {
		System.out.println(id+" "+name+" "+price);
	}
	
}


public class Exercise47 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many product want: ");
        int size =scanner.nextInt();
		Product[] product = new Product[size];
		int id ;
		double price;
		String proName ;
		for(int i = 0 ;i< size; i++ ) {
			System.out.println("Enter "+ i +"detail ");
			System.out.println("Enter id: ");
			id = scanner.nextInt();
			System.out.println("Enter Name: ");
			proName = scanner.next();
			System.out.println("Enter Price: ");
			price=scanner.nextDouble();
			product[i] = new Product(id,proName,price);
		}
		
       for(int i = 0 ; i<size ; i++) {
    	   
    	   System.out.println(product[i].toString());
       }
		
//		Product colddrink = new Product(105,"Cold Drink",80.0);
//         Product mobile = new Product(101,"Mobile",30000.0);
//         Product notebook = new Product(104,"Notebook",120.0);
//         Product soap = new Product(102,"Soap",50.0);
//         Product toothpaste = new Product(103,"Tooth Passte",100.0);
	}

}
