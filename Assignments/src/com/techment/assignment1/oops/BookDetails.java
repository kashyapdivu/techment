package com.techment.assignment1.oops;

import java.util.Scanner;

class Book{
	
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
}


class EngineeringBook extends Book{
	private String category; 
	
	public EngineeringBook(int bookNo, String title, String author, float price) {
		super(bookNo, title, author, price);	
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

		
}


public class BookDetails {

	public static void main(String[] args) {
		
	
		
		int bookNumber;
		String author,title;
		float price;
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter Book Number : ");
		bookNumber= scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Book Title : ");
		title= scan.nextLine();
		scan.nextLine();
		System.out.println("Enter Book Author Name : ");
		author= scan.nextLine();
		
		System.out.println("Enter Book price : ");
		price= scan.nextFloat();
		
		
		Book book = new Book(bookNumber,title,author,price);
		System.out.println(" Book Number : "+ book.getBookNo()+"\n"
		                    +" Title: "+book.getTitle()+"\n"
		                    +" Author : "+ book.getAuthor()+"\n"
		                    +" Price : "+book.getPrice());
		
		
	}


	

}
