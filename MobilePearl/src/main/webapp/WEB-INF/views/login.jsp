<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:if test="${error ne null}">
	<h4 style="color: red;">${error}</h4>
</c:if>
<form action="<c:url value="/login"/>" method="post">
	<fieldset>
		<legend>
			<spring:message code="login.title" />
		</legend>
		<table>
			<tr>
				<td><spring:message code="login.username" /></td>
				<td><input type="text" id="username" name="username"
					placeholder="<spring:message code="login.username"/>" /></td>
			</tr>
			<tr>
				<td><spring:message code="login.password" /></td>
				<td><input type="password" id="password" name="password"
					placeholder="<spring:message code="login.password"/>" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><button id="login">
						<spring:message code="button.login" />
					</button></td>
			</tr>
		</table>
	</fieldset>
</form>
