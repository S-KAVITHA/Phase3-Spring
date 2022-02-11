
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
			<font color="blue">Welcome SportyShoes User Login Page !!!
		</h2>
		</font>
		
	
		<form action="usersubmit">

			<font color="red"><h4>${error}</h4></font>
			<font color="blue"><h4>${message}</h4></font><br><br>
			
			 
			Enter Name : <input type="text" name="emailId" required><br><br> 
			Enter Password : <input type="text" name="password" required><br><br>
			<input type="submit"> <br> <br>
			
		</form>

		<form action="Createuser">
			<button>Create Account</button>
			<br> <br>
		</form>
		
	</center>
	<jsp:include page="/view/components/footer.jsp"></jsp:include>
</body>
</html>



