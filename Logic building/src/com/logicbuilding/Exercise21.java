package com.logicbuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Products{
	
	private int id;
	private String name;
	private int price;
	
	public Products(int id2, String name2, int price2) {
		// TODO Auto-generated constructor stub
	}
	
	public Products(int size) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}

public class Exercise21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many product want to store :");
		int size = scanner.nextInt();
		
		ArrayList<Products> products = new ArrayList<Products>();
		
		for(int i =0; i<size ; i++) {
			 System.out.println("Enter id: ");
			 int id = scanner.nextInt();
			 System.out.println("Enter Name: ");
			 String name = scanner.next();
			 System.out.println("Enter Price: ");
			 int price = scanner.nextInt();
			 
			products.add(new Products(id,name,price));
	         }
		
		ArrayList<Products> productList = new ArrayList<Products>();
		productList.addAll(products);
		
		 System.out.println("Products List :::");
		 
		// productList.stream().forEach(System.out::println);
		]]]]]]
		 
		 for(Products p : productList) {
			 
			 System.out.println(p.getId()+"  "+p.getName()+"  "+p.getPrice());
		 }
		 
		 
	}

}
