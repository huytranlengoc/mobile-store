<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
	<fieldset>
		<legend>Checkout</legend>
		<c:if test="${not empty order}">
			<form action="<c:url value="/index"/>" method="post">
				<table border="1">
					<c:set var="no" value="0"/>
					<c:forEach var="p" items="${order.products}">
						<c:set var="no" value="${no+1}"/>
						<tr>
							<th>Number</th>
							<th>Product Name</th>
							<th>Quantity</th>
							<th>Price</th>
						</tr>
						<tr>
							<td>${no}</td>
							<td>${p.name}</td>
							<td></td>
						</tr>
					</c:forEach>
				</table>
				<button id="checkout">Checkout</button>
			</form>
		</c:if>
		<c:if test="${empty order }">
			You don't choose any Product, can order <a href="<c:url value="/index"/>">here</a>
		</c:if>
	</fieldset>
</body>
