package com.code.servlet;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.*;

public class  SecondServlet extends GenericServlet {
@Override
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
	System.out.println("created using GenericServlet....");
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	pw.println("<h1>This is my second servlet using generic servlet</h1>");
}
}
