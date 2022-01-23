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
		<h2>Add Products Here !!!</h2>
		<form action="addtotable">

			   <font color="blue"><h2>${Products}</h3> </h2></font>

				<br> Enter Name : <input type="text" name="prod_name"><br>
				<br> Enter Price : <input type="text" name="price"><br>

				<br> <input type="submit"> <br> <br>
		</form>

		<h3>
			<a href="/Home">Go Back to Home Page</a>
		</h3>
	</center>

</body>
</html>



