<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div style="float: left;">
	<h2>Mobile Online Shopping</h2>
</div>
<div style="float: right;">
	<c:set var="acc" value="${sessionScope.account.firstname}" />
	<c:if test="${acc eq null}">
		Welcome, Guest!<br />
		<a href="${pageContext.request.contextPath}/login">Login</a> | 
		<a href="<c:url value="/customer/register"/>">Register</a>
	</c:if>
	<c:if test="${acc ne null}">
		Welcome, ${acc}!<br />
		<a href="<c:url value="/cart/checkout"/>">Shopping Cart</a> | 
		<a href="${pageContext.request.contextPath}/logout">Logout</a>
	</c:if>
</div>