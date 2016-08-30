<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@ page import="java.util.List,com.citibank.creditcardservice.login.utilities.Customer"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%
	List<Customer> customerList =(List<Customer>)request.getAttribute("allCustomers");	   
	
	
	for(Customer customer:customerList){
	 out.println(customer.getfName());
	 out.println(customer.getlName());
	 out.println(customer.getCustomerAddress().getStreet());
	 out.println(customer.getCustomerAddress().getCity());
	 out.println(customer.getCustomerAddress().getState());
	 out.println(customer.getCustomerAddress().getZip());
	 out.println("<hr>");
	}
	 
	 %>
	<table border=2px>

<tr>

            <td>First Name </td>
            <td> Last Name </td>
            <td> Street</td>
            <td>City </td>
            <td> State</td>  
            <td>Zip </td>
</tr>
    <c:forEach items="${allCustomers}" var="customer">
        <tr>
            <td> ${customer.fName} </td>
            <td> ${customer.lName} </td>
            <td> ${customer.customerAddress.street} </td>
            <td> ${customer.customerAddress.city} </td>
            <td> ${customer.customerAddress.state} </td>
            <td> ${customer.customerAddress.zip} </td>   
        </tr>
    </c:forEach>
</table>
	
	
</body>
</html>