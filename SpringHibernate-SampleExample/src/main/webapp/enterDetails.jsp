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
<center>

<table>

<h2>Enter the Deatails</h2>
<form:form  action="EnteredDetails" method="post" modelAttribute="student">
<tr>
	<td>Name:</td>
	<td><form:input  path="name"/></td>
</tr>

<tr>
	<td>Fname:</td>
	<td><form:input path="Fname"/></td>
</tr>

<tr>
	<td>Phone num:</td>
	<td><form:input path="phnum"/></td>
</tr>

<tr>
	<td>Address:</td>
	<td><form:input path="address"/></td>
</tr>

<tr>
<td>
<input type="submit" value="Click here">
</td>
</tr>
</form:form>

</table>
</center>
</body>
</html>