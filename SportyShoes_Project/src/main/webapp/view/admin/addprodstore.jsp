<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>
</br> </br>

	<h3>
		<font color="blue">Products Added Successfully !!! </font></br> </br>
	</h3>
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
			<th>Created Date</th>
			<th>Discount</th>
			<th>Quantity</th>

		</tr>

		<tr>
			<td>${prod.productId}</td>
			<td>${prod.name}</td>
			<td>${prod.category.category_Id}</td>
			<td>${prod.season}</td>
			<td>${prod.shoetype}</td>
			<td>${prod.price}</td>
			<td>${prod.color}</td>
			<td>${prod.createdDate}</td>
			<td>${prod.discount}</td>
			<td>${prod.quantity}</td>
	</table>
	<br />

	<h3>
		<a href="/Home">Go Back to Home Page</a>
	</h3>
	<jsp:include page="/view/components/footer.jsp"></jsp:include>

</center>
