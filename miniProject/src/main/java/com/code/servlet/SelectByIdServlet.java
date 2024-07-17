package com.code.servlet;

import java.io.IOException;

import com.code.dao.RegisterDao;
import com.code.daoImpl.RegisterDaoImpl;
import com.code.model.RegisterModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet; // Imports the HttpServlet class
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/selectbyid")
public class SelectByIdServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { // Overrides
																													// the
																													// doGet
																													// method
																													// to
																													// handle
																													// GET
																													// requests

		int id = Integer.parseInt(req.getParameter("id")); // Retrieves the "id" parameter from the request and parses
															// it to an integer

		RegisterDao selectIdDao = new RegisterDaoImpl(); // Creates a new instance of RegisterDaoImpl
		RegisterModel dataUser = selectIdDao.getDataById(id); // Calls the getDataById method to get user data by ID

		RequestDispatcher dis = req.getRequestDispatcher("update.jsp"); // Gets a RequestDispatcher for the "update.jsp"
																		// page
		req.setAttribute("dataUser", dataUser); // Sets the "dataUser" attribute in the request with the user data

		dis.forward(req, res); // Forwards the request and response to "update.jsp"
	}
}
