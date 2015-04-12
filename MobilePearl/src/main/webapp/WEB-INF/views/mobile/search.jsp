<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="GET" modelAttribute="mobileSearchCriteria">
	<fieldset>
		<legend>Book Search</legend>
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><form:select path="category.id" items="${categories}" itemValue="id" itemLabel="name"/>
			</tr>
		</table>
	</fieldset>
	<button id="search">Search</button>
</form:form>
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
			<c:set var="no" value="0" />
			<c:forEach var="p" items="${products}">
				<c:set var="no" value="${no+1}" />
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
