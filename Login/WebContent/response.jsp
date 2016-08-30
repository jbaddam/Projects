 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.citibank.creditcardservice.login.utilities.Customer,com.citibank.creditcardservice.login.utilities.Address"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
        <%@ page import="com.citibank.creditcardservice.login.controller.LoginController" %>
            <%@ page import="java.io.*" %>
                <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
                <html>

                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                    <title>Log in Success</title>
                </head>

                <body>
                
                    <%
						 Customer cust = (Customer)request.getAttribute("customer");
                    Address custAddress = new Address();
						 PrintWriter writer = response.getWriter();
					%>
					
					<h3>
					<% 
					writer.println(cust.getfName()+ " "+cust.getlName()+""+"<br>");
					writer.println(cust.getCustomerAddress().getStreet()+" "+cust.getCustomerAddress().getCity()+"<br>");
					writer.println(cust.getCustomerAddress().getState()+" "+cust.getCustomerAddress().getZip()+"<br>");
                    %>
                    
                    <%=
                    		cust.getfName()+ " "+cust.getlName()+"\n"  
                    
                    %>
                    
                    <%=
                    		cust.getCustomerAddress().getStreet()+" "+cust.getCustomerAddress().getCity()
                    %>
                    </h3>  <br>   
                    <a href="login.html"><small>Log Out</small></a>             
                
                </body>

                </html>