package com.bootcamp.employeesurvey.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

import com.bootcamp.employeesurvey.services.EmployeeInfoService;
import com.bootcamp.employeesurvey.utilities.Employee;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeInformationController")
public class EmployeeInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeInfoController() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		Employee info = new Employee();
		EmployeeInfoService sevice = new EmployeeInfoService();
		
		/**
		 * Accessing the data from html form and 
		 * populating to the EmployeeInfo object
		 */
		info.setExperience(request.getParameter("experience"));
		info.setJ2eeTechnolgy(request.getParameter("J2EE"));
		info.setWebservice(request.getParameter("WebServices"));
		
		
		String frameworks = "";
		String[] frwks = request.getParameterValues("FrameWork");
		for(int i = 0; i <frwks.length ;i++){
			
			frameworks = frameworks+frwks[i];
		}
		
		System.out.println(frameworks);
		info.setFramework(frameworks);			
		info.setComments(request.getParameter("message"));	
		
		
		//calling the getMessge method from service layer
		String messge = sevice.getMessage(info);
				
		out.println(messge);
		
		doGet(request, response);
	}

}
