package com.bootcamp.webapplication.creditcardactivation.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bootcamp.webapplication.creditcardactivation.entities.CreditCard;
import com.bootcamp.webapplication.creditcardactivation.entities.Customer;
import com.bootcamp.webapplication.creditcardactivation.services.CreditCardActivationService;



/**
 * Servlet implementation class CreditCardRegistration
 */
@WebServlet("/CreditCardActivation")
public class CreditCardActivationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditCardActivationController(){
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();;
		
		Customer  customer = new Customer();
		CreditCard card = new CreditCard();
		card.setCreditCardNumber(request.getParameter("cardnumber"));
		card.setCvv(request.getParameter("cvv"));
		customer.setSsn(request.getParameter("ssn"));
		customer.setCard(card);		
		CreditCardActivationService ccas = new CreditCardActivationService();
		
		
		
		if( ccas.validateCreditCard(customer)){
		          			
			String docType =
				      "<!doctype html public \"-//w3c//dtd html 4.0 " +
				      "transitional//en\">\n";
				      out.println(docType +
				        "<html>\n" +
				        "<head></head>\n"+
				        "<body bgcolor=\"#f0f0f0\">\n" +
				        "<h4 align=\"center\">Creditcard Activation Sucessfull</h4>\n" +
				        "<h4 align=\"center\"> First Name :" +  ccas.cs.getFname()  + "</h4>\n" +
				        "<h4 align=\"center\"> Last Name :" +  ccas.cs.getLname()  + "</h4>\n"+	
				        "<h4 align=\"center\"> Your Credit Limit :" +  ccas.cs.getCard().getCreditLimit()  + "</h4>\n"+	
				       "<h4 align=\"center\"> Creditcadr Number :" +  ccas.cs.getCard().getCreditCardNumber()  + "</h4>+\n</body>\n</html>");	
		doGet(request, response);
	}
		
		else{
			String docType =
				      "<!doctype html public \"-//w3c//dtd html 4.0 " +
				      "transitional//en\">\n";
				      out.println(docType +
				        "<html>\n" +
				        "<head></head>\n"+
				        "<body bgcolor=\"#f0f0f0\">\n" +
				        "<h1 align=\"center\">Oops! Credit card Activation Failed</h1>\n" +
				        "<h4 align=\"center\"> You have enterd invalid card details</h4>\n"+
				        "</body>\n</html>");
		}
}
	
}
