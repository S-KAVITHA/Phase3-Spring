  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  

  
<h1><font color="blue">Products List</h1></font>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Product Id</th><th>Product Name</th><th>Price</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="prod" items="${products}">   
   <tr>  
   <td>${prod.pid}</td>  
   <td>${prod.prod_name}</td>  
   <td>${prod.price}</td>  
 
   <td><a href="editprod/${prod.pid}">Edit</a></td>  
   <td><a href="deleteprod/${prod.pid}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   
      <h3> <a href="/Home">Go Back to Home Page</a></h3>
      <jsp:include page="/view/components/footer.jsp" ></jsp:include>
      
      