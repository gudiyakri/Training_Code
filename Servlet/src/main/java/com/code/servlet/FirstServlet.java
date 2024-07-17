package com.code.servlet;
import java.io.*;  
import jakarta.servlet.*;  
  
public class FirstServlet implements Servlet{  
ServletConfig conf;  
  

//Life Cycle methods
public void init(ServletConfig conf)
{  
this.conf=conf;  
System.out.println("servlet is initialized OR creating object..");  
}  
  
public void service(ServletRequest req,ServletResponse res)  
throws IOException,ServletException{  
  
	System.out.println("Servicing.......");
res.setContentType("text/html");  
  
PrintWriter out=res.getWriter();  
out.print("<html><body>");  
out.print("<b>Hello Servlet!....</b>");  
out.print("</body></html>");  
  
}  
public void destroy()
{
	System.out.println("servlet is destroyed");
	}  


//non life Cycle
public ServletConfig getServletConfig()
{
	return this.conf;
}  
public String getServletInfo()
{
	return "copyright 2019-2025";}

  
}  
