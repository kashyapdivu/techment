package com.techment.day8.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product implements Comparable<Product> {

	int id;
	int quantity;
	double price;
	String name;

	public Product(int id, int quantity, double price, String name) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", quantity=" + quantity + ", price=" + price + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Product o) {
		if (o.price > 500)
			return 1;
		else
			return -1;
	}

}

class QuantitySorting implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		if (o1.quantity == o2.quantity)
			return 0;
		else if (o1.quantity < o2.quantity)
			return 1;
		else
			return -1;
	}
}

class PriceSorting implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		double result = o1.price - o2.price;
		if (result > 0)
			return 1;
		if (result < 0)
			return -1;
		return 0;
	}
}

public class ProductDemo {

	public static void main(String[] args) {

		ArrayList<Product> product = new ArrayList();
		product.add(new Product(101, 20, 333.3, "Product 1"));
		product.add(new Product(102, 2, 555.3, "Product 2"));
		product.add(new Product(103, 220, 893.3, "Product 3"));
		product.add(new Product(104, 44, 222.3, "Product 4"));
		product.add(new Product(105, 50, 999, "Product 5"));

		System.out.println("---------------All Products List------------");

		for (Product p : product) {
			System.out.println(p);
		}

		Collections.sort(product);
		System.out.println("\n---------------Price greater than 500------------");

		for (Product p : product) {
			if (p.price > 500)
				System.out.println(p);
		}

		Collections.sort(product, new QuantitySorting());
		System.out.println("\n---------------sorted by quantity in descending order------------");

		for (Product p : product) {

			System.out.println(p);
		}

		Collections.sort(product, new PriceSorting());
		System.out.println("\n---------------sorted by price in ascending order------------");

		for (Product p : product) {

			System.out.println(p);
		}

	}

}
