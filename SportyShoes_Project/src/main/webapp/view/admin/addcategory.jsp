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
		<h2><font color="blue">Add Category Here !!!</h2></font>
		<form action="addcattotable">
		
		
		<h5><font color="green"><h2>${message}</h5> </font>
		

			<table border=1 cellspacing=2 cellpadding=4>
				<tr>
					<td width=25%>Category Name</td>
					<td><input name=name type="text"></td>
				</tr>
				<tr>
					<td width=25%></td>
					<td><button>Add Category</button></td>
				</tr>


			</table>
		</form>

		<h3>
			<a href="/Home">Go Back to Home Page</a>
		</h3>
	</center>
<jsp:include page="/view/components/footer.jsp" ></jsp:include>
</body>
</html>



