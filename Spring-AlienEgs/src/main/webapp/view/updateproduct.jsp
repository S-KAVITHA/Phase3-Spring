  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 
 <center> 
<font color="blue"><h2>Update product here !!!</h2></font>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Product Id</th><th>Product Name</th><th>price</th></tr>  
     
   <tr>  
   <td><center>${Products.pid}</center></td>  
   <td><center>${Products.prod_name}</center></td>  
   <td><center>${Products.price}</center></td>  
   
   </tr>  
     </table>  
   <br/>  
   
   		<form action="/updtotable">
			<h3>Update Price Here !!!</h3>
			 	<br> Enter Price : <input type="text" name="price"><br>

				<br> <input type="submit"> <br> <br>
		</form>
		<h3>
			<a href="/Home">Go Back to Home Page</a>
		</h3>
	</center>
    </center> 