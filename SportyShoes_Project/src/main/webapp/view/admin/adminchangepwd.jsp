<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.example.demo.model.Admin"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${admin.ID}
${admin.adminId}

<br></br>
	<center>
		<h2><font color="blue">Update Password Here !!!</h2></font>
	
		<form method="POST" action="/Saveadminpwd/${admin.ID}">
		<input type="hidden" name=ID type="text" value="${admin.ID}" />
			
		<input type="hidden" name=adminId type="text" value="${admin.adminId}" />
			
	
			<table border=1 cellspacing=2 cellpadding=4>
				<tr>
				
						<td width=25%>Password</td>
					<td><input name=adminpwd type="text" value="${admin.adminpwd}"></td>
				</tr>
				<tr>
					<td width=25%></td>
					<td><button>Update Password</button></td>
				</tr>


			</table>
		</form>

		</center>
<jsp:include page="/view/components/footer.jsp" ></jsp:include>


</body>
</html>