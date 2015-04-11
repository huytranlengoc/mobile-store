<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:if test="${sessionScope.account ne null}">
	<h1>Welcome, ${sessionScope.account.fullname}!</h1>
</c:if>
<h2>Account List</h2>
<c:if test="${!empty  listAccount}">
	<ul>
		<c:forEach var="a" items="${listAccount}">
			<li>${a.username}-${a.password}</li>
		</c:forEach>
	</ul>
</c:if>
