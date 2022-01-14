<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld page</title>
</head>
<body>
    Hello : ${greeting}
    <br>
    <br>
    <br>
    <form action="user" method="post">
       Enter UserName:<input type="text" name="userName"><br> 
                      <input type="submit" value="Submit">
                      <a href="https://www.google.com">Google page</a><br><br> 

<a href="welcome.jsp">Add Employee</a>  
<a href="viewemp">View Employees</a> 

                  
    </form>
</body>
</html>