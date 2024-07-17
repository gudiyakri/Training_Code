package com.code.servlet;

import java.io.IOException;

import com.code.daoImpl.RegisterDaoImpl;
import com.code.model.RegisterModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateservlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id")); // Retrieves the "id" parameter from the request and parses
															// it to an integer
		String name = req.getParameter("name"); // Retrieves the "name" parameter from the request
		String password = req.getParameter("password"); // Retrieves the "password" parameter from the request
		String email = req.getParameter("email"); // Retrieves the "email" parameter from the request
		String contact = req.getParameter("contact"); // Retrieves the "contact" parameter from the request

		System.out.println("Id in UpdateServlet " + id); // Prints the ID to the console for debugging

		RegisterModel update = new RegisterModel(); // Creates a new instance of RegisterModel
		update.setId(id); // Sets the ID field in the RegisterModel instance
		update.setName(name); // Sets the name field in the RegisterModel instance
		update.setPassword(password); // Sets the password field in the RegisterModel instance
		update.setEmail(email); // Sets the email field in the RegisterModel instance
		update.setContact(contact); // Sets the contact field in the RegisterModel instance

		RegisterDaoImpl updateDao = new RegisterDaoImpl(); // Creates a new instance of RegisterDaoImpl

		if (updateDao.updateRegister(update)) { // Calls the updateRegister method and checks if it returns true
			res.sendRedirect("viewDetails"); // Redirects the response to "viewDetails" if the update was successful
		} else { // If the update was not successful
			res.sendRedirect("/error.jsp"); // Redirects the response to "error.jsp" if the update failed
		}
	}
}
