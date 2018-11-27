<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Search</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css">

<link rel="stylesheet" href="main.css">

</head>
<body>
	<div class="container">

		<h1>Customer City</h1>
		<form action="/find">
			<input type="text" name="customerCity" value="${city}"
				placeholder="City"> <input class="btn btn-primary"
				type="submit" value="Search">



		</form>
		
		<table class="table">
			<thead>
				<tr>
					<th>City</th>
					<th>Company Name</th>
					<th>Contact Name</th>
				</tr>
			</thead>
			<tbody> 
 				<c:forEach items="${customers}" var="f"> 
 				<tr> 
						<td>${f.customerCity}</td> 
 						<td>${f.companyName}</td> 
 						<td>${f.contactName}</td>
						<td><a class="btn btn-primary" href="/update?id=${f.customerCity}">Edit</a></td>
						<td><a class="btn btn-primary" href="/delete?id=${f.customerCity}">Remove</a></td> 
					</tr> 
				</c:forEach>
				</tbody>
				</table>
			</div>	
</body>
</html>