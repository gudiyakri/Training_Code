package com.code.servlet;

import java.io.IOException;
import com.code.dao.RegisterDao;
import com.code.daoImpl.RegisterDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet; // Imports the HttpServlet class
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete") // Defines the URL pattern for this servlet
public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id")); // Retrieves the "id" parameter from the request and parses
															// it to an integer

		RegisterDao deleteDao = new RegisterDaoImpl(); // Creates a new instance of RegisterDaoImpl

		if (deleteDao.deleteRegister(id)) { // Calls the deleteRegister method and checks if it returns true
			res.sendRedirect("viewDetails"); // Redirects the response to "viewDetails" if the deletion was successful
		} else { // If the deletion was not successful
			res.sendRedirect("error.jsp"); // Redirects the response to "error.jsp" if the deletion failed
		}
	}
}
