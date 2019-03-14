<%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" 
%>

<div class="container">
	<div class="row">
	<!-- To display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp" %>
		</div>
		
	<!-- To display product -->
		<div class="col-md-9">
		
			<!-- added breadcrumb component -->
			<div class="row">
			
				<div class="col-mg-12">
				
				<c:if test="${userClickAllProducts == true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Prodcuts</li>
					</ol>
				</c:if>
				
				<c:if test="${userClickCategoryProducts == true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
					</ol>
				</c:if>
				
				</div>
			</div>
		</div>
	</div>
</div>