package com.springcore.javaconfig;

//@Component("firststudent")
public class Student {
	private Price price;
	
	
	public Student(Price price) {
		super();
		this.price = price;
	}


	public Price getPrice() {
		return price;
	}


	public void setPrice(Price price) {
		this.price = price;
	}


	public void study() {
		this.price.display();
		System.out.println("student is reading book");
	}
}
