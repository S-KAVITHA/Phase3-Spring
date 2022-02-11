<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

   
<center>
</br> </br>
<h2>
	<font color="blue">Users List </font></br> </br>
</h2>
</font>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Address</th>
		<th>City</th>
		<th>ZipCode</th>
		<th>State</th>
		<th>Country</th>
		<th>Age</th>
		<th>Contact_No</th>
	</tr>
	<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.fname}</td>
			<td>${user.lname}</td>
			<td>${user.address}</td>
			<td>${user.city}</td>
			<td>${user.zipcode}</td>
			<td>${user.state}</td>
			<td>${user.country}</td>
			<td>${user.age}</td>
			<td>${user.contact_no}</td>
	</tr>
	</c:forEach>
</table>
<br />

<h3>
	<a href="/Home">Go Back to Home Page</a>
</h3>
<jsp:include page="/view/components/footer.jsp"></jsp:include>

</center>
