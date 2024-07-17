
package com.jdbc.main;
    /*
import java.sql.Connection;
import java.sql.DriverManager;
public class MainClass{
	public static void main(String[]args)throws Exception{
		getConnection();
	}
	public static void getConnection()throws Exception{
	try {	String url="jdbc:mysql://localhost:3306/shoppingsystem";
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,"root","Gudiya@1234");
	System.out.println("con");
	con.close();
	}catch(Exception e) {
		System.out.println(e);
		
	}

	}
}

*/


import java.util.Scanner;

import com.jdbc.model.Employee;
import com.jdbc.service.DatabaseService;
public class MainClass {

	public static void main(String[] args) {
		
DatabaseService databaseService=new DatabaseService();
		
		try(Scanner sc =new Scanner(System.in);){
			
			boolean isRunning=true;
			
			while(isRunning) {

System.out.println("Enter choice");
System.out.println("1. Insert");
System.out.println("2. Select all");
System.out.println("3. Select employee by an id");
System.out.println("4. Delete employee");
System.out.println("5. Update employee");
System.out.println("6. Exit");
int choice=Integer.parseInt(sc.nextLine()); 
switch(choice) {
case 1:
	System.out.println("Enter name, address, salary");
	
// Employee employee=new Employee(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
	
	databaseService.insertEmployee(new Employee(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
	break;
case 2:
	databaseService.getAllEmployees();
	break;
case 3:
	System.out.println(choice);
	break;
case 4:
	System.out.println(choice);
	break;
case 5:
	System.out.println(choice);
	break;
	
case 6:
	System.out.println("Thank you. Visit again");
	isRunning=false;
	break;
default:
	System.out.println("Incorrect choice");
	break;
}
		
			}
		}catch(Exception e) {
			throw new RuntimeException("Something went wrong"+e);
		}
	
}

}