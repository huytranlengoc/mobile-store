<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
<form:form modelAttribute="customerRegistration" method="post">
	<c:if test="${notmatch ne null}">
		<h4 style="color: red;">${notmatch}</h4>
	</c:if>
	<fieldset>
		<legend>
			<strong>User Information</strong>
		</legend>
		<table>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username" cssClass="error" />
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="confirmPassword">Confirm Password</form:label></td>
				<td><form:password path="confirmPassword" /></td>
				<td><form:errors path="confirmPassword" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="firstname">First name</form:label></td>
				<td><form:input path="firstname" /></td>
				<td><form:errors path="firstname" cssClass="error" />
			</tr>
			<tr>
				<td><form:label path="lastname">Last name</form:label></td>
				<td><form:input path="lastname" /></td>
				<td><form:errors path="lastname" cssClass="error" />
			</tr>
		</table>
	</fieldset>
	<hr />
	<fieldset>
		<legend>
			<strong>Customer Information</strong>
		</legend>
		<table>
			<tr>
				<td><form:label path="phone">Phone</form:label></td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssClass="error" />
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" /></td>
				<td><form:errors path="address" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="city">City</form:label></td>
				<td><form:input path="city" /></td>
				<td><form:errors path="city" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="country">Country</form:label></td>
				<td><form:input path="country" /></td>
				<td><form:errors path="country" cssClass="error" />
			</tr>
			<tr>
				<td><form:label path="nationality">Nationality</form:label></td>
				<td><form:input path="nationality" /></td>
				<td><form:errors path="nationality" cssClass="error" />
			</tr>
		</table>
	</fieldset>
	<button id='save'>Save</button>
</form:form>
