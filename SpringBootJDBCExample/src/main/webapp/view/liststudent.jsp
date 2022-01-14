  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>stuloyees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="stu" items="${Students}">   
   <tr>  
   <td>${stu.studentId}</td>  
   <td>${stu.studentName}</td>  
   <td>${stu.age}</td>  
 
   <td><a href="editstu/${stu.studentId}">Edit</a></td>  
   <td><a href="deletestu/${stu.studentId}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  