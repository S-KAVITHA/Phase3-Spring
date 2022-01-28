<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Add Category Here !!!</h2>
		<form action="addcattotable">
		
		
		<font color="blue"><h2>${message}</h3> </h2></font>
		

			<table border=1 cellspacing=2 cellpadding=4>
				<tr>
					<td width=25%>Product Name</td>
					<td><input name=name type="text"></td>
				</tr>
				<tr>
					<td width=25%></td>
					<td><button>Add Product</button></td>
				</tr>


			</table>
		</form>

		<h3>
			<a href="/Home">Go Back to Home Page</a>
		</h3>
	</center>

</body>
</html>



