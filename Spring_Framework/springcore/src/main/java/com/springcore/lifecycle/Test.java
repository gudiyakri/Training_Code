package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		A a = (A)context.getBean("a1");
//		
//		System.out.println(a);
		
	//	registering shutdown hook
	context.registerShutdownHook();
//
//		System.out.println("++++++++++++++++++++++++");
//		B b = (B) context.getBean("b1");
//		System.out.println(b);
		
Example exm=(Example) context.getBean("exm");
System.out.println(exm);
		
	}

}
