  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
 
<h2> <font color="blue">Product ${Product.id} Updated Successfully !!!</h2> </font> <br> <br>

${Product}
   <h3> <a href="/Home">Go Back to Home Page</a></h3>
   <jsp:include page="/view/components/footer.jsp" ></jsp:include>