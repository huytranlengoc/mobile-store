<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<fieldset>
		<legend>Checkout</legend>
		<c:if test="${cart ne null}">
			<form action="<c:url value="/index"/>" method="post">
				<table border="1">
					<tr>
						<th>Number</th>
						<th>Product Name</th>
						<th>Quantity</th>
					</tr>
					<c:set var="no" value="0" />
					<c:forEach var="c" items="${cart.products}">
						<c:set var="no" value="${no+1}" />
						<tr>
							<td>${no}</td>
							<td>${c.key.name}</td>
							<td>${c.value}</td>
						</tr>
					</c:forEach>
				</table>
				<button id="checkout">Checkout</button>
			</form>
		</c:if>
		<c:if test="${cart eq null}">
			You don't choose any Product, can order <a
				href="<c:url value="/index"/>">here</a>
		</c:if>
	</fieldset>
</body>
