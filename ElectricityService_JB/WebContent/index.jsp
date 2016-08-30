<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.bootcampjava.electricityservice.models.fileprocessor.Customer,java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Electricity Service</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>

<body>
<div>
	<form action="FileProcessorServlet" method="POST"
		enctype="multipart/form-data">

		<div class="col-3" style="margin-top: 50px">			

			<label class="btn btn-primary" > <span class = "glyphicon glyphicon-folder-open" Style="margin-right:10px"></span>Choose File
			<input type="file" name="inputfile" style="display: none;" required>
			</label> 
            <button type="submit" class="btn btn-success">Process</button>
            <br><br>			
	   </div>
	</form>
	
	<form action="DataCleanerServlet" method="post">
	<div class="col-3" style="margin-top: 20px">
	<button type="submit" class="btn btn-danger">Delete Data<span class="glyphicon glyphicon-trash" style="margin-left:10px"></span></button>
	<%
		if ("success".equals(request.getAttribute("status"))){ 
	%>  
	<font color="green"><b>Done</b><span class = "glyphicon glyphicon-thumbs-up" style="font-size:20px;margin-left:10px"></span></font>
	<% }%>	
	</div>
	</form>
</div>

	<%
		if ("processed".equals(request.getAttribute("Status"))) {
	%>
	<div class = "container">
<div class="row">
	
	<div class="col-8">
		<%
			ArrayList<Customer> custList = (ArrayList<Customer>) request.getAttribute("customerList");
		%>
		<table class="table table-striped table-responsive">
			<tr class="danger">
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Phone Number</th>
				<th>Service Id</th>
				<th>Start Date</th>
				<th>End Date</th>
			</tr>
			<c:forEach items="${customerList}" var="customer">
				<tr>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}</td>
					<td>${customer.email}</td>
					<td>${customer.phone}</td>
					<td>${customer.serviceInfo.serviceID}</td>
					<td>${customer.serviceInfo.startDate}</td>
					<td>${customer.serviceInfo.endDate}</td>
				</tr>

			</c:forEach>

		</table>

	</div>
	<div class="col-4"></div>
	</div>
	</div>
	<%
		}
	%>
	<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</body>
</html>