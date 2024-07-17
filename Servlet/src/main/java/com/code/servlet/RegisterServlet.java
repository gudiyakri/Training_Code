package com.code.servlet;
import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h2>Welcome to Regiser Servlet</h2>");
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String cond=req.getParameter("condition");
		//pw.println(cond);
		if(cond!=null) {
		if(cond.equals("checked"))
	
		{
				pw.println("<h2>Name:"+name+"</h2>");
				pw.println("<h2>Password:"+password+"</h2>");
				pw.println("<h2>Email:"+email+"</h2>");
				pw.println("<h2>Gender:"+gender+"</h2>");
				pw.println("<h2>Course:"+course+"</h2>");
			
		//
		//JDBC
		//
		//saved to db
	//	...
			
				//call forword() method
				RequestDispatcher rd=req.getRequestDispatcher("success");
				rd.forward(req, res);
		}
			else {
				pw.println("<h2>You have not accepted terms and conditions</h2>");
			}
		}
			else {
			
		pw.println("<h2>You have not accepted terms and conditions</h2>");
		
	//I want to include output of Register.html
	//get the object of RequestDispatcher
	
		RequestDispatcher rd=req.getRequestDispatcher("Register.html");
		
	//call include() method
		rd.include(req, res);
			}
		}

	}

