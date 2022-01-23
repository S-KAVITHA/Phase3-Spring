<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  <%@page import="com.example.demo.model.Products"%>  
 
  	
 <center> 
 </table> 
 
        <h2>Edit Product</h2>  <br>
        
       <form method="POST" action="/Save">   
      
      <h3>
     
       <input type="hidden" name="id" value="${products.pid}"/>  
             
     Product Name:   <input type="text" name="name" value="${products.prod_name}"/>  <br><br>
     
     Product Price:   <input type="text" name="price" value="${products.price}"/>  <br><br>
     
 					 <input type="submit" value="Submit"/>

 </center></h3> 
     </table>   
</form>  
       
       