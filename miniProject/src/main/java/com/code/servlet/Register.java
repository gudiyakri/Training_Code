package com.code.servlet;

import java.io.IOException;
import com.code.dao.RegisterDao;
import com.code.daoImpl.RegisterDaoImpl;
import com.code.model.RegisterModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet; // Imports the HttpServlet class
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name"); // Retrieves the "name" parameter from the request
		String password = req.getParameter("pass"); // Retrieves the "pass" parameter from the request
		String email = req.getParameter("email"); // Retrieves the "email" parameter from the request
		String contact = req.getParameter("contact"); // Retrieves the "contact" parameter from the request

		RegisterModel register = new RegisterModel(); // Creates a new instance of RegisterModel
		register.setName(name); // Sets the name field in the RegisterModel instance
		register.setPassword(password); // Sets the password field in the RegisterModel instance
		register.setEmail(email); // Sets the email field in the RegisterModel instance
		register.setContact(contact); // Sets the contact field in the RegisterModel instance

		RegisterDao registerDao = new RegisterDaoImpl(); // Creates a new instance of RegisterDaoImpl

		if (registerDao.addRegister(register)) { // Calls the addRegister method and checks if it returns true
			res.sendRedirect("viewDetails"); // Redirects the response to "viewDetails" if the registration was
												// successful
		} else { // If the registration was not successful
			res.sendRedirect("/error.jsp"); // Redirects the response to "error.jsp" if the registration failed
		}
	}
}
