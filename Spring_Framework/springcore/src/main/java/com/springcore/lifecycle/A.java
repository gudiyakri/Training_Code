package com.springcore.lifecycle;

public class A {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}

	public A() {
		super();
	}

	@Override
	public String toString() {
		return "A [price=" + price + "]";
	}

	public void init() {
		System.out.println("inside init method");
	}

	public void destroy() {
		System.out.println("inside destroy method");
	}

}
