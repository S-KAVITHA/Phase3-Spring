
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h1>
		<font color="blue"> SportsShoes E-Commerce Web-site !!!<Green>
	</h1>
	</font>

	
	<form method="post">
	<p align="right">
		<button type="submit" formaction="/adminchangepwd/${adminId}/${adminPwd}">Change Password</button>
		<button type="submit" formaction="/Logout">Logout</button>
	</p>
	</form>
	

	<center>
		<h3>
			<font color="blue">Welcome ${adminId},</br> </br> You are allowed
				to perform all these maintainence operations.
			</font>
		</h3>

		<h3>
			<a href="/adminproducts">Add Products</a>
		</h3>
		<h3>
			<a href="/admincategories">Add Categories</a>
		</h3>
		<h3>
			<a href="/ListProducts">List Products</a>
		</h3>
		<h3>
			<a href="/Listusers">List Users</a>
		</h3>
		<h3>
			<a href="/ListPurchases">Purchase Report</a>
		</h3>

	</center>

	<jsp:include page="/view/components/footer.jsp"></jsp:include>

</body>
</html>



