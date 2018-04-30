package com.samstanding.periodic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ElementBoxServlet
 */
@WebServlet("/elementbox")
public class ElementBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElementBoxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String searchCriteria = request.getParameter("searchCriteria");
    		String searchTerm = request.getParameter("searchTerm").trim().toLowerCase(); 
    		ChemicalElement elem = LookupChemicalElement.by(SearchOptions.getOptionFromString(searchCriteria), searchTerm);
    		request.setAttribute("chemicalElement", elem);
    		String address = "/chemicalElement.jsp";
    		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
    		dispatcher.forward(request, response);
    	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
