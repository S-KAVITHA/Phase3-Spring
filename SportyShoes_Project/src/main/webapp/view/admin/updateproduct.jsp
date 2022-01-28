<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  <%@page import="com.example.demo.model.Product"%>  
 
  	
 <center> 
 </table> 
 
        <h2>Edit Product</h2>  <br>
        
       <form method="POST" action="/Save">   
     
      		<input type=hidden name=id value="${product.productId }">
			<table border=1 cellspacing=2 cellpadding=4>
				<tr>
					<td width=25%>Product Name</td>
					<td><input name=name type="text"></td>
				</tr>
				<tr>
					<td width=25%>Category</td>
					<td><select name=category>
							<option value="0">Select category</option> ${brand_list}
					</select></td>
				</tr>

				<tr>
					<td width=25%>Season</td>
					<td><input name=Season type="text"></td>
				</tr>
				<tr>
					<td width=25%>Brand</td>
					<td><input name=Brand type="text"></td>

				</tr>
				<tr>
					<td width=25%>Price</td>
					<td><input name=Price type="number"></td>
				</tr>
				<tr>
					<td width=25%>Color</td>
					<td><input name=Color type="text"></td>
				</tr>
				<tr>
					<td width=25%>Discount</td>
					<td><input name=Discount type="text"></td>
				</tr>
				<tr>
					<td width=25%>Quantity</td>
					<td><input name=Quantity type="number"></td>
				</tr>

				<tr>
					<td width=25%></td>
					<td><button>Add Product</button></td>
				</tr>


			</table>
		</form>

	</center>

 </center></h3> 
     </table>   
</form>  
       
       