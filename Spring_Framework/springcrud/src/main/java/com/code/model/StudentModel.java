package com.code.model;

public class StudentModel {
private int id;
private String name,email,pass;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
    return "StudentModel [name=" + name + ", email=" + email + ", pass=" + pass + "]";
}
}
