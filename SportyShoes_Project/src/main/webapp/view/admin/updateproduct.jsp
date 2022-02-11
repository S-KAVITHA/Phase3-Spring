<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.example.demo.model.Product"%>
<%@page import="com.example.demo.model.Categorys"%>


<center>
<h2><font color="blue">Update Products here!!!</h2></font>

	<form method="POST" action="/Save/${products.productId}">

<input type="hidden" name=id type="text" value="${products.productId}" />
			
		
		<table border=1 cellspacing=2 cellpadding=4>
			
			<tr>
				<td width=25%>Product Name</td>
				<td><input name=name type="text" value="${products.name}" /></td>
			</tr>
			<tr>
				<td width=25%>Category</td>
				<td><input name=category type="text"
					value="${products.category.category_Id}" /></td>
			</tr>

			<tr>
				<td width=25%>Season</td>
				<td><input name=Season type="text" value="${products.season}" /></td>
			</tr>
	
	<tr>
				<td width=25%>ShoeType</td>
				<td><input name=ShoeType type="text" value="${products.shoetype}" /></td>
			</tr>
			
			<tr>
				<td width=25%>Price</td>
				<td><input name=Price type="number" value="${products.price}" /></td>
			</tr>
			<tr>
				<td width=25%>Color</td>
				<td><input name=Color type="text" value="${products.color}" /></td>
			</tr>
			<tr>
				<td width=25%>Discount</td>
				<td><input name=Discount type="text"
					value="${products.discount}" /></td>
			</tr>
			<tr>
				<td width=25%>Quantity</td>
				<td><input name=Quantity type="number"
					value="${products.quantity}" /></td>
			</tr>

			<tr>
				<td width=25%></td>
				<td><button>Update Product</button></td>
			</tr>


		</table>
	</form>
</center>

<jsp:include page="/view/components/footer.jsp"></jsp:include>

