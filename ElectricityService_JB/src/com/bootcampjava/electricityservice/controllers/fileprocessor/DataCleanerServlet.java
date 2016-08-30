package com.bootcampjava.electricityservice.controllers.fileprocessor;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bootcampjava.electricityservice.services.fileprocessor.FileProcessorService;

/**
 * @author Jagan Reddy
 * Servlet implementation class DataCleaner
 */
@WebServlet("/DataCleanerServlet")
public class DataCleanerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataCleanerServlet() {
        super();       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FileProcessorService service = new FileProcessorService();
		
		/*
		 * if all customer data deleted from database then forwarding request and response
		 * object by setting Attribute values to index.jsp
		 */		
		if(service.cleanData()){
			request.setAttribute("status", "success");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

}
