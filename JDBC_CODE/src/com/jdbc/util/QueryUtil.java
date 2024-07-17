package com.jdbc.util;

public class QueryUtil {
public static String insertEmployeeQuery() {
	return "INSERT INTO employee_info(employee_name,employee_address,employee_salary) values(?,?,?)"; 
}
public static String selectAllEmployeeQuery() {
	return "select * from employee_info";
}
public static String selectEmployeeById(int employeeId) {
	return "select * from employee_info where employee_id="+employeeId;
}
}
