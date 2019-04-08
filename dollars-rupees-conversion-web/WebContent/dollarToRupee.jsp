<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conersion</title>
</head>
<body>
	
	<h2>Dollars to Rupees conversion</h2>
	<table border="1" style="text-align: center; align-self: center;"> 
		<thead>
			<tr>
				<th>Dollars</th>
				<th>Rupees</th>		
			</tr>
		</thead>
		<tbody>
			<c:forEach var="i" begin="1" end ="50">
					<tr>
						<td>${i}</td>
						<td>${i*45}</td>
					</tr>
			</c:forEach>
		
		</tbody>
	
	
	</table>
	
</body>
</html>