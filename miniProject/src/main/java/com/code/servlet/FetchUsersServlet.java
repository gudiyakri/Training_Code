package com.code.servlet;

import java.io.IOException;
import java.util.List;

import com.code.daoImpl.RegisterDaoImpl;
import com.code.model.RegisterModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewDetails") // Defines the URL pattern for this servlet
public class FetchUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RegisterDaoImpl registerDao = new RegisterDaoImpl(); // Creates a new instance of RegisterDaoImpl
		List<RegisterModel> fetchUsers = registerDao.fetchAll(); // Calls the fetchAll method to get a list of all
																	// registered users
		req.setAttribute("fetchUsers", fetchUsers); // Sets the "fetchUsers" attribute in the request with the list of
													// users
		RequestDispatcher dispatcher = req.getRequestDispatcher("displayInfo.jsp"); // Gets a RequestDispatcher for the
																					// "displayInfo.jsp" page
		dispatcher.forward(req, res); // Forwards the request and response to "displayInfo.jsp"
	}
}
