package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
@Bean	
public Price getPrice() {
	return new Price();
}
	
	
@Bean	
public Student getStudent() {

	//creating a new student object
	Student student=new Student(getPrice());
	return student;
}
}
