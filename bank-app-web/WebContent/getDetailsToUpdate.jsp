<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
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
		<div class="container">
			<h4>
				Fill the form to Update<b> Account</b>
			</h4>
			<form action="updateAccountDetails.do" method="post">
				<div class="form-group">
					<label for="name">Account Id:</label> <input type="number"
						class="form-control" name="accountId"
						value="${account.accountId}" readonly>
				</div>
				<div class="form-group">
					<label for="name">Customer Name:</label> <input type="text"
						class="form-control" id="text" name="accountHolderName"
						value="${account.accountHolderName}" >
				</div>
				<div>
					<label for="account type">Account Type:</label>
					&nbsp;&nbsp;&nbsp;&nbsp; <select class="form-control"
						name="accountType">
						<c:set var="type" value="${account.accountType}"></c:set>
						<c:if test="${type eq 'CURRENT'}">
							<option value="CURRENT"><c:out value="${type}"></c:out></option>
							<option value="SAVING">SAVING</option>
						</c:if>
						<c:set var="type" value="${account.accountType}"></c:set>
						<c:if test="${type eq 'SAVING'}">
							<option value="SAVING"><c:out value="${type}"></c:out></option>
							<option value="CURRENT">CURRENT</option>
						</c:if>
					</select>

				</div>
				<div class="form-group">
					<br> <label for="balance">Account Balance:</label> <input
						type="number" class="form-control" name="accountBalance"
						value="${account.accountBalance}" readonly>
				</div>
				<br>
				<button type="submit" class="btn btn-primary">Update
					Account</button>
			</form>

		</div>
	</div>


</body>
</html>
