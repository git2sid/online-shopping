 
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!--  <div class="col-md-3"> -->
                <p class="lead">Categories</p>
     <div class="list-group">             
  <c:forEach items="${categories }" var="category">
  
   <a href="${pageContext.request.contextPath}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a>
  </c:forEach>  
              
                </div>
       <!--      </div> -->
            
 