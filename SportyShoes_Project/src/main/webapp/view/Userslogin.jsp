  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<form action="loginhome.jsp">
			<font color="blue"><h2>Welcome to Sporty Shoes User Login page !!!</h2></font>
			<br> Enter User Name <input type="text" name="username" required>
			<br> <br> Enter Password <input type="password" name="password" required> <br> <br>
			<button>Login</button>
			<br> <br>
		</form>

		<form action="Createuser.jsp">
			<button>Create Account</button>
			<br> <br>
		</form>

		<form action="Changepwd.jsp">
			<button>Change Password</button>
			<br> <br>
		</form>

	<centre> <strong><font color="red"><c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}" />
            </c:if></font></strong>
     </center>
            
     	</div>
	
</body>
</html>