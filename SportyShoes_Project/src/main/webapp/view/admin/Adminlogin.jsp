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
		<h2>Welcome SportyShoes Admin Login Page !!!</h2>
		<form action="adminsubmit">

			   <font color="red"><h2>${error}</h3> </h2></font>

				<br> Enter Name : <input type="text" name="admin_id"><br>
				<br> Enter Password : <input type="text" name="pwd"><br>

				<br> <input type="submit"> <br> <br>
		</form>

	</center>

</body>
</html>



