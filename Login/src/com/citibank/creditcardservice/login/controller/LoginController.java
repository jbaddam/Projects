package com.citibank.creditcardservice.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.citibank.creditcardservice.login.service.LoginService;
import com.citibank.creditcardservice.login.utilities.Address;
import com.citibank.creditcardservice.login.utilities.Customer;
import com.citibank.creditcardservice.login.utilities.CustomerCredentials;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		CustomerCredentials credentials = new CustomerCredentials();
		credentials.setUserName(request.getParameter("userName"));
		credentials.setPassword(request.getParameter("password"));
		customer.setCustomerCredentials(credentials);

		if ("login".equals(request.getParameter("login"))) {

			login(request, response, customer, customer.getCustomerCredentials().getUserName(),
					customer.getCustomerCredentials().getPassword());
		}

		if ("register".equals(request.getParameter("register"))) {

			register(request, response);
		}
		
		if ("Customer Info".equals(request.getParameter("Customer Info"))) {

			getAllCustomers(request, response);
		}
		
		

	}

	private void login(HttpServletRequest request, HttpServletResponse response, Customer customer, String userName,
			String password) throws ServletException, IOException {

		LoginService service = new LoginService();

		if (service.validateCredentials(customer)) {
			Customer customerFromService = service.customerFromDao;


			HttpSession session = request.getSession(false);
			if (session != null)
				request.setAttribute("customer", customerFromService);

			RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
			rd.forward(request, response);
		} else {
			PrintWriter er = response.getWriter();
			er.println("login faied");
		}

	}

	private void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Customer registerCustomer = new Customer();
		CustomerCredentials credentials = new CustomerCredentials();
		Address regCustAddress = new Address();

		registerCustomer.setfName(request.getParameter("fname"));
		registerCustomer.setlName(request.getParameter("lname"));

		regCustAddress.setStreet(request.getParameter("street"));
		regCustAddress.setCity(request.getParameter("city"));
		regCustAddress.setState(request.getParameter("state"));
		regCustAddress.setZip(request.getParameter("zip"));

		credentials.setUserName(request.getParameter("userName"));
		credentials.setPassword(request.getParameter("password"));

		registerCustomer.setCustomerCredentials(credentials);
		registerCustomer.setCustomerAddress(regCustAddress);

		LoginService service = new LoginService();

		if (service.registerService(registerCustomer)) {

			login(request, response, registerCustomer, registerCustomer.getCustomerCredentials().getUserName(),
					registerCustomer.getCustomerCredentials().getPassword());

		}

	}
	
	public void getAllCustomers(HttpServletRequest request, HttpServletResponse response){
		LoginService service = new LoginService();
		List<Customer> customerList = service.getAllCustomers();
		request.setAttribute("allCustomers", customerList);
		RequestDispatcher rd = request.getRequestDispatcher("customerInfo.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem in forwarding to JSP");
			e.printStackTrace();
		}
		
		
	}

}
