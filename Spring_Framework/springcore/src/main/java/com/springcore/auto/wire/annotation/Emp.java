package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("temp2")
	private Address address;

	public Address getAddress() {
		return address;
	}
//	@Autowired
	
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}

//	@Autowired
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
