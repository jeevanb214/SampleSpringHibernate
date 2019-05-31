<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>

<h2>Enter the Deatails</h2>
<form:form  action="Update"  method="post" modelAttribute="student">

<input type="hidden"  name="key" value="${student.id}"/>
<tr>
	<tr>
	<td>Name:</td>
	<td><form:input  path="name" value="${student.name}"/></td>
</tr>

<tr>
	<td>Fname:</td>
	<td><form:input path="Fname" value="${student.fname}"/></td>
</tr>

<tr>
	<td>Phone num:</td>
	<td><form:input path="phnum" value="${student.phnum}"/></td>
</tr>

<tr>
	<td>Address:</td>
	<td><form:input path="address" value="${student.address}"/></td>
</tr>

<tr>
<td>
<input type="submit" value="Click here">
</td>
</tr>
</form:form>

</body>
</html>