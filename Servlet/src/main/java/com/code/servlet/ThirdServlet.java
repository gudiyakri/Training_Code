package com.code.servlet;
import java.io.*;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class ThirdServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{

System.out.println("this is get method.......");
res.setContentType("text/http");
PrintWriter pw=res.getWriter();
pw.println("<h1>this is get method of my servlet</h1>");
pw.println(new Date().toString());
}
}
