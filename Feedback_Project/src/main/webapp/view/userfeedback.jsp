<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="com.example.demo.model.Feedback"%>
<%@ page import="java.util.List"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
</head>
<body>
	<center>
		</div>
		<h2><font color="blue">Add Feedback here!!!</h2></font>
		
		<form action="addtotable">
			<h5><font color="green"><h2>${response_feed}</h5> </font>
			<table border=1 cellspacing=2 cellpadding=4>
				<tr>
					<td width=25%>Feedback</td>
					<td><input name=Comments type="text" size=75></td>

				</tr>
				
					<td width=25%></td>
					<td><button>Add Feedback</button></td>
				</tr>


			</table>
		</form>
		
	
	</center>


</body>
</html>