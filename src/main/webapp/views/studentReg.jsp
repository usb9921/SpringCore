<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="saveStudent" modelAttribute="student" method="POST">
	
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name"/></td>
			</tr>
			
			<tr>
			<td>Email:</td>
			<td><form:input path="email"/></td>
			</tr>
			
			<tr>
			<td>Phno:</td>
			<td><form:input path="phno"/></td>
			</tr>
			
			<tr>
			<td>gender:</td>
			<td>
			<form:radiobuttons path="gender" items="${gender}"/>
			</td>
			</tr>
			
			<tr>
			<td>Courses:</td>
			<td><form:select path="course">
			<form:options items="${course}"/>
			</form:select></td> 
			</tr>
			
			<tr>
			<td>Timings:</td>
			<td>
			<form:radiobuttons path="timings" items="${timingOptions}" />
			</td>
			</tr>
			
			
			<tr>
			<td>
			<input type="submit" value="Register"/>
			</td>
			</tr>
			
		</table>
	</form:form>
</body>
</html>
