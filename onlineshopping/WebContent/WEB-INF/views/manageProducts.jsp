<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url var="js" value="/static/js" />
<script src="${js}/myApp.js"></script>
<div class="container">
	<div class="row">
		<c:if test="${not empty message }">

			<div class="co-xs-12">

				<div class="alert alert-success alert-dismissible">

					<button type="button" class="close" data-dismiss="alert">&times;</button>
					${message }
				</div>
			</div>

		</c:if>


		<div class="col-md-offset-2 com-md-8">

			<div class="panel panel-primary">
				<div class="panel-heading">
					<h1>Product Management</h1>

				</div>
				<div class="panel-heading">
					<!-- FORM ELEMENTS -->
					<sf:form class="form-horizontal" modelAttribute="command"
						action="${pageContext.request.contextPath }/manage/products"
						method="POST" enctype="multipart/form-data">

						<div class="form-group">
							<label class="control-lebel col-md-4" for="name">Enter
								Product Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="name" id="name"
									placeholder="Product Name" class="form-control"></sf:input>
								<sf:errors path="name" ccsClass="help-block" element="em"></sf:errors>

								<em class="help-block">Please enter Product Name</em>
							</div>
						</div>

						<div class="form-group">
							<label class="control-lebel col-md-4" for="brand">Enter
								brand Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="brand" id="brand"
									placeholder="brand Name" class="form-control" />
								<sf:errors path="brand" cssClass="help-block" element="em"></sf:errors>
								<em class="help-block">Please enter Product Name</em>

							</div>
						</div>


						<div class="form-group">
							<label class="control-lebel col-md-4" for="description">Enter
								Description:</label>
							<div class="col-md-8">
								<!-- 	<input type="text" name="brand" id="brand"
									placeholder="brand Name" class="form-control" /> -->

								<sf:textarea rows="4" cols="40"
									placeholder="enter some text here" id="description"
									path="description" class="form-control"></sf:textarea>
								<sf:errors path="description" cssClass="help-block" element="em"></sf:errors>
								<em class="help-block">Please enter Description</em>

							</div>
						</div>


						<div class="form-group">
							<label class="control-lebel col-md-4" for="unitPrice">Enter
								unitPrice</label>
							<div class="col-md-8">
								<sf:input type="text" path="unitPrice" id="unitPrice"
									placeholder="unitPrice" class="form-control" />
								<sf:errors path="unitPrice" cssClass="help=-block" element="em"></sf:errors>
								<em class="help-block">Please enter "unitPrice"</em>

							</div>
						</div>


<!--  this is the fiel element for immage -->
						<div class="form-group">
							<label class="control-lebel col-md-4" for="file">Enter
								File</label>
							<div class="col-md-8">
								<sf:input type="file" path="file" id="file" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-lebel col-md-4" for="category">Enter
								Category:</label>
							<div class="col-md-8">
								<!-- <input type="text" name="category" id="category"
									placeholder="category" class="form-control" /> -->
								<sf:select class="form-control" path="categoryId"
									id="categoryId" items="${categories}" itemLabel="name"
									itemValue="id">


								</sf:select>
								<em class="help-block">Please enter "unitPrice"</em>

							</div>
						</div>


						<div class="form-group">

							<div class="col-md-8 col-md-offset-4">
								<input type="submit" name="submit" id="submit"
									placeholder="brand Name" class="btn btn-primary" />

								<sf:hidden path="id" />
								<sf:hidden path="supplierId" />
								<sf:hidden path="code" />
								<sf:hidden path="purchases" />
								<sf:hidden path="views" />
								<sf:hidden path="active" />

							</div>
						</div>

					</sf:form>


				</div>
			</div>



		</div>


	</div>

</div>