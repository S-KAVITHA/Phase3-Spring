<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page import="com.example.demo.model.Product"%>  
   <%@page import="com.example.demo.model.Categorys"%> 
   
<center>
<h2>
	<font color="blue">Products List </font></br> </br>
</h2>
</font>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Category</th>
		<th>Season</th>
		<th>Shoe Type</th>
		<th>Price</th>
		<th>Color</th>
		<th>Discount</th>
		<th>Quantity</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="prod" items="${products}">
		<tr>
			<td>${prod.productId}</td>
			<td>${prod.name}</td>
			<td>${prod.category.category_Id}</td>
			<td>${prod.season}</td>
			<td>${prod.shoetype}</td>
			<td>${prod.price}</td>
			<td>${prod.color}</td>
			<td>${prod.discount}</td>
			<td><input name=qty type="number" maxlength=50></td>

			<td><a href="/buy/${prod.productId}/${userId}">Add To Cart</a></td>
			
			
		</tr>
	</c:forEach>
</table>
<br />

<h3>
	<a href="/UserHome">Go Back to Home Page</a>
</h3>
<jsp:include page="/view/components/footer.jsp"></jsp:include>

</center>
