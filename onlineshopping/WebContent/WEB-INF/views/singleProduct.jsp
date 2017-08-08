<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
    <spring:url var="css" value="/static/css" />
     <spring:url var="js" value="/static/js" />
      <spring:url var="fonts" value="/static/fonts" />
         <spring:url var="images" value="/static/images" />


<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/home">Home</a></li>
				<li><a href="${pageContext.request.contextPath}/view/all/products">View Products</a></li>
				<li class="active">${product.name}</li>
			</ol>

		</div>
	</div>




<div class="row">
<div class="col-xs-12 col-sm-4">
<div class="thumbnail">

<img src="${images}/${product.code}.jpg"class="img img-responsive myImagesOfProducts"/>
</div>


   </div>

<div class="col-xs-12 col-sm-8">   
</div>
<h3>${product.name}</h3>
<hr>
<p>${product.description}</p>
<hr>
<h4>Price : <strong> '&#8377;' ${product.unitPrice}</strong></h4>
<hr>
<h6>QuantityAvailable : ${product.quantity}</h6>
<hr>

<a href="${pageContext.request.contextPath }/cart/add/${product.id}/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span>Add To Cart</a>&#160;
<a href="${pageContext.request.contextPath  }/view/all/products" class="btn btn-primary">Home</a>  
</div>
</div>





    <!-- jQuery -->
    <script src="${js}/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${js}/bootstrap.min.js"></script>
    
    <!-- jquery datatables -->
      <script src="${js}/jquery.dataTables.js"></script>
      
    <!--   datatables.bootstrap.js for data table -->
    <script src="${js}/dataTables.bootstrap.js"></script>
    
    
    <!-- my made script file  -->
      <script src="${js}/myApp.js"></script>