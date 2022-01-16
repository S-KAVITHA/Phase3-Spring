<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>
</head>
<body>
${Products}
${Products.pid}
<form action="updateLoc" method="post">
<pre>
	id:   <input type="text" name="id" value = "${location.id}" readonly/>
	code: <input type="text" name="code" value = "${location.code}"/>
	name: <input type="text" name="name" value = "${location.name}"/>
	type: rural <input type ="radio" name="type" value ="RURAL" ${location.type=='URBAN'?'checked':'' }/>
		  Urban <input type ="radio" name="type" value= "URBAN" ${location.type=='RURAL'?'checked':'' }/>
	<input type="submit" name="save"/>
</pre>
</form>

</body>
</html>