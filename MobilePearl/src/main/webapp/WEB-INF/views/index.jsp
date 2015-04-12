<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div style="clear: both;">
	<c:if test="${sessionScope.account ne null}">
		<h1>Welcome, ${sessionScope.account.fullname}!</h1>
	</c:if>
	<div style="float: left;border-style: solid;border-width: 5px;border-color: red;">
		<c:if test="${!empty categories}">
			<ul style="list-style-type: none; left: 5px;text-align: center;">
				<li><h4>Category</h4></li>
				<c:forEach var="c" items="${categories}">
					<li><h4><a href="">${c.name}</a></h4></li>
				</c:forEach>
			</ul>
		</c:if>
	</div>
	<div style="float: left; padding-left: 20px;">
		<h3 style="color: green">Products List</h3>
		(Click to see more details)
		<br/>
		<c:if test="${not empty products}">
			<table border="1">
				<thead>
					<tr>
						<th>No.</th>
						<th>Name</th>
						<th>Category</th>
						<th>Unit Price</th>
						<th>Screen Size</th>
						<th>Operating System</th>
						<th>CPU</th>
						<th>Camera</th>
						<th>Pin</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:set var="no" value="0"/>
				<c:forEach var="p" items="${products}">
					<c:set var="no" value="${no+1}"/>
					<tr>
						<td>${no}</td>
						<td><a href="<c:url value="/mobile/detail/${p.id}"/>">${p.name}</a></td>
						<td>${p.category.name}</td>
						<td>${p.unitPrice}</td>
						<td>${p.screenSize}</td>
						<td>${p.os}</td>
						<td>${p.cpu}</td>
						<td>${p.camera}</td>
						<td>${p.pin}</td>
						<td><a href="<c:url value="/cart/add/${p.id}"/>">Add to Cart</a></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</div>