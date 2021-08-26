package com.techment.modal;

import java.util.List;

public class Resturant {

	String resturantName;
	//Tea tea;
	
	IHotDrink hotDrink;
	ISoftDrink softDrink;
	List<String> employeeName;
	
	public List<String> getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(List<String> employeeName) {
		this.employeeName = employeeName;
	}

	public IHotDrink getHotDrink() {
		return hotDrink;
	}

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public ISoftDrink getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}

	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	
//	public void setTea(Tea tea) {
//		this.tea = tea;
//	}

	public void displayResturantDetails() {
		
		System.out.println("resturant name : "+resturantName);
//        System.out.println("Price of tea : "+tea.price);
//	     tea.message();
	
	  hotDrink.drink();
	  softDrink.drink();
	  System.out.println(employeeName);
	
	}
	
}
