package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class B implements InitializingBean,	DisposableBean {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public B() {
	super();
}

@Override
public String toString() {
	return "B [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
//init
	System.out.println("init method...");
	
}

public void destroy() throws Exception {
//destroy
	System.out.println("destroy method....");
}


}
