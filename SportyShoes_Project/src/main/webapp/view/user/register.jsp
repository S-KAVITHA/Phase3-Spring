<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sporty Shoes - Register</title>
</head>
<body>
	<center>
		<h2>
			<font color="blue">Welcome SportyShoes User Registration Page
				!!! <br> <br>
		</h2>
		</font>


		<form name=frmReg action="signupaction" method="post">
			<table border=1 cellspacing=2 cellpadding=4>
				<tr>
					<td width=25%>Email id</td>
					<td><input name=emailId type="email" maxlength=50></td>
				</tr>
				<tr>
					<td width=25%>Password</td>
					<td><input name=password maxlength=10 type="password"></td>
				</tr>
				<tr>
					<td width=25%>Confirm Password</td>
					<td><input name=password2 maxlength=10 type="password"></td>
				</tr>
				<tr>
					<td width=25%>First name</td>
					<td><input name=fname maxlength=25></td>
				</tr>
				<tr>
					<td width=25%>Last name</td>
					<td><input name=lname maxlength=25></td>
				</tr>
				<tr>
					<td width=25%>Age</td>
					<td><input name=age maxlength=3 type="number"></td>
				</tr>
				<tr>
					<td width=25%>Address</td>
					<td><input name=address maxlength=100></td>
				</tr>

				<tr>
					<td width=25%>City</td>
					<td><input name=city maxlength=100></td>
				</tr>

				<tr>
					<td width=25%>Zipcode</td>
					<td><input name=zipcode maxlength=100></td>
				</tr>

				<tr>
					<td width=25%>State</td>
					<td><input name=state maxlength=100></td>
				</tr>

				<tr>
					<td width=25%>Country</td>
					<td><input name=country maxlength=100></td>
				</tr>

				<tr>
					<td width=25%>ContactNo</td>
					<td><input name=contactNo maxlength=100></td>
				</tr>


				<tr>
					<td width=25%>IdentityType</td>
					<td><select name="identitytype">
							<c:forEach items="${type_list}" var="getidentitytype">
								<option value="${getidentitytype.name}">${getidentitytype.name}</option>
							</c:forEach>
					</select></td>
				</tr>

				<tr>
					<td width=25%>Enter Identity No</td>
					<td><input name=IdentityNo maxlength=100></td>
				</tr>


				<tr>
					<td width=25%></td>
					<td><button>Register</button></td>
				</tr>


			</table>
		</form>

	</center>
	<jsp:include page="/view/components/footer.jsp"></jsp:include>
</body>
</html>