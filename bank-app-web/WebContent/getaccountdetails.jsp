<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Welcome to MMS Banking</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"><b>MMs Bank</b></a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="index.html">Home</a></li>
				<li><a href="newaccount.html">Open New Account</a></li>
				<li><a href="withdraw.html">Withdraw</a></li>
				<li><a href="deposite.html">Deposit</a></li>
				<li><a href="transfer.html">Fund Transfer</a></li>
				<li><a href="searchaccount.html">Search Account</a></li>
				<li><a href="checkbalance.html">Check Balance</a></li>
				<li><a href="allaccounts.html">Display All Account Details</a></li>
				<li><a href="deleteaccount.html">Delete Account</a></li>
				<li><a href="updateaccount.html">Update Account Details</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h2>Customers Account Details</h2>
		<br>

		<table class="table table-bordered" style="margin-top: 50px">
			<thead>
				<tr>
					<th>Account Id</th>
					<th>Customer Name</th>
					<th>Account Type</th>
					<th>Account Balance</th>
				</tr>
			</thead>
				<tbody>
						<tr>
							<td>${account.accountId}</td>
							<td>${account.accountHolderName}</td>
							<td>${account.accountType}</td>
							<td>${account.accountBalance}</td>
						</tr>
				</tbody>
		</table>
	</div>
</body>
</html>