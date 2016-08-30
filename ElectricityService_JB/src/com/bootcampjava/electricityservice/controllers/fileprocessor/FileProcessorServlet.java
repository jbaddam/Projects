package com.bootcampjava.electricityservice.controllers.fileprocessor;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bootcampjava.electricityservice.services.fileprocessor.FileProcessorService;
import com.bootcampjava.electricityservice.models.fileprocessor.Customer;

/**
 * @author Jagan Reddy
 * Servlet implementation class FileProcessorServlet
 */
@WebServlet("/FileProcessorServlet")
@MultipartConfig
public class FileProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FileProcessorServlet() {
		super();		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
        //accessing file from request object
		Part filePart = request.getPart("inputfile");
		
		InputStream customerInputStream = filePart.getInputStream();
		
		FileProcessorService service = new FileProcessorService();
		
		
		/*
		 * if all customer information processed  then forwarding request and response
		 * object by setting Attribute values to index.jsp
		 */		
		if(service.processCustomerInfo(customerInputStream)){			
			List<Customer> custList = service.getAllCustomers();
			
			request.setAttribute("customerList", custList);
			request.setAttribute("Status", "processed");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
		}
			
	}

}
