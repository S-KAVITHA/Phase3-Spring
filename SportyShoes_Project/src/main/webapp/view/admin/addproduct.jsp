<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.example.demo.model.Categorys"%>
<%@ page import="java.util.List"%>
<%@ page import="com.example.demo.model.Season"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
</head>
<body>

	<center>
	
	
	 <select name="type_list" name="type_list" id="type_list">
      <option value="Select"></option>
        <c:forEach var="type_list" items="${type_list}">
            <li>${type_list}</li>
        </c:forEach>
    </select>

 <select name="category">
						<c:forEach items="${type_list}" var="category">
							<option value="${category.brand}"></option>
						</c:forEach>
					</select>

		</div>
		<h2>Add Products here!!!</h2>
		<br> <font color="blue"><h2>${message}</h3>
			</h2></font>

		<form action="addtotable">

			<table border=1 cellspacing=2 cellpadding=4>
				<tr>
					<td width=25%>Product Name</td>
					<td><input name=name type="text"></td>

				</tr>
				<tr>
				<td width=25%>Category</td>	
				<td>
					<select name="category">
						<c:forEach items="${categories}" var="category">
							<option value="${category.category_Id}">${category.name}</option>
						</c:forEach>
					</select>
					</td>
				</tr>

				<tr>
					<td width=25%>Season</td>
					<td><input name=Season type="text"></td>
				</tr>
				<tr>
					<td width=25%>Brand</td>
					<td><input name=Brand type="text"></td>

				</tr>
				<tr>
					<td width=25%>Price</td>
					<td><input name=Price type="number"></td>
				</tr>
				<tr>
					<td width=25%>Color</td>
					<td><input name=Color type="text"></td>
				</tr>
				<tr>
					<td width=25%>Discount</td>
					<td><input name=Discount type="text"></td>
				</tr>
				<tr>
					<td width=25%>Quantity</td>
					<td><input name=Quantity type="number"></td>
				</tr>

				<tr>
					<td width=25%></td>
					<td><button>Add Product</button></td>
				</tr>


			</table>
		</form>
	</center>

	<h3>
		<a href="/Home">Go Back to Home Page</a>
	</h3>

</body>
</html>