
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/static/css" />
<spring:url var="js" value="/static/js" />
<spring:url var="fonts" value="/static/fonts" />
<spring:url var="images" value="/static/images" />

<script src="${js}/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${js}/bootstrap.min.js"></script>
<!-- my made script file  -->
<script src="${js}/myApp.js"></script>




<div class="container">

	<div class="row">

		<div class="col-md-3">

			<jsp:include page="./shared/leftbar.jsp"></jsp:include>

		</div>

		<div class="col-md-9">

			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts==true }">
					
					<script>
					window.categoryId="";
					</script>
						<ol class="breadcrumb">

							<li><a href="${pageContext.request.contextPath }/home">Home</a></li>
							<li class="active">All Products</li>

						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts==true }">
					
					<script>
					window.categoryId= ${category.id};
					</script>
						<ol class="breadcrumb">

							<li><a href="${pageContext.request.contextPath }/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${ category.name}</li>

						</ol>
					</c:if>

				</div>

			</div>

			<div class="row">

				<div class="col-xs-12">

					<table id="productListTable"
						class="table table-striped table-borderd table-hover">


						<thead>

							<tr>
							    <th>IMAGE</th>
								<th>NAME</th>
								<th>BRAND</th>
								<th>PRICE</th>
								<th>QUANTITY</th>
								<th></th>

							</tr>

						</thead>

	<tfoot>

							<tr>
							      <th>IMAGE</th>
								<th>NAME</th>
								<th>BRAND</th>
								<th>PRICE</th>
								<th>QUANTITY</th>
									<th></th>

							</tr>

						</tfoot>




					</table>
				</div>
			</div>
		</div>

	</div>

</div>