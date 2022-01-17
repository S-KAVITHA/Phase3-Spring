  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h2> Product Updation Page !!!</h2>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Product Id</th><th>Product Name</th><th>price</th></tr>  
     
   <tr>  
   <td><center>${Products.pid}</center></td>  
   <td><center>${Products.prod_name}</center></td>  
   <td><center>${Products.price}</center></td>  
   
   </tr>  
     </table>  
   <br/>  
   
   <form:form method="POST" action="/ProductJDBCExample/editprod">    
			<font color="blue"><h2>Update Price here !!!</h2></font>
			<h5><br> Enter New Price : <input type="text" name="price"><br> <br></h5>
			
		<h3>	<bold> <button>Submit</button></bold></h3>
		
		
			<br> <br>
	     </form:form> 
   