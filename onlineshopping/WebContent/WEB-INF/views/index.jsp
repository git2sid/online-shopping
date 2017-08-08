 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
    <spring:url var="css" value="/static/css" />
     <spring:url var="js" value="/static/js" />
      <spring:url var="fonts" value="/static/fonts" />
         <spring:url var="images" value="/static/images" />
    <%--
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/main.css">
<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>siddharth</h1><br>

<div class="sid">${contextRoot } says --  ${greeting}</div>
</body>
</html> --%>

<!DOCTYPE html>
<html lang="en">

<head>
<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online SHopping  - ${title} </title>
    <script >
    window.menu= '${title}'
    window.contextRoot='${contextRoot}'
    </script>

    <!-- Bootstrap Core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    
    <!-- bootstrap readable theme -->
        <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
        
        <!-- data table bootstrap.css -->
          <link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
        
    <!-- Custom CSS -->
    <link href="${css}/myapp.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<div class="wrapper">
    <!-- Navigation -->
  <jsp:include page="./shared/navbar.jsp"></jsp:include>

    <!-- Page Content -->
    <div class="content">
    <c:if test="${userClickHome == true}">
   <jsp:include page="/WEB-INF/views/home.jsp"></jsp:include>
   </c:if>
   
   <c:if test="${userClickAbout==true }">
   <jsp:include page="/WEB-INF/views/about.jsp"></jsp:include>
   </c:if>
   
    <c:if test="${userClickProducts==true }">
   <jsp:include page="/WEB-INF/views/products.jsp"></jsp:include>
   </c:if>
   
    <c:if test="${userClickcontact==true }">
   <jsp:include page="/WEB-INF/views/contact.jsp"></jsp:include>
   </c:if>
   
    <c:if test="${userClickAllProducts==true  or  userClickCategoryProducts==true }">
   <jsp:include page="/WEB-INF/views/listProducts.jsp"></jsp:include>
   </c:if>
   
   <!-- including the single product page -->
     <c:if test="${userClickShowProduct==true }">
   <jsp:include page="/WEB-INF/views/singleProduct.jsp"></jsp:include>
   </c:if>
   
 </div>
   
   
    <!-- /.footer -->

  <jsp:include page="./shared/footer.jsp"></jsp:include>
    <!-- /.footer -->

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
</div>
</body>

</html>
