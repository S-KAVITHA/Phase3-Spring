
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h2>
			<font color="blue">Welcome SportyShoes Admin Login Page !!!
		</h2>
		</font>
		
	
		<form action="adminsubmit">

			<font color="red"><h2>${message}</h3>
				</h2></font> <br> Enter Name : <input type="text" name="admin_id" required><br>
			<br> Enter Password : <input type="text" name="pwd" required><br>

			<br> <input type="submit"> <br> <br>
		</form>

	

	</center>
	<jsp:include page="/view/components/footer.jsp"></jsp:include>
</body>
</html>



