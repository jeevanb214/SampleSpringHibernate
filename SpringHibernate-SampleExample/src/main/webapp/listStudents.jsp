<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<center>
<h1>Students Information</h1>  
<form action = "updateOrDelete" method = "post">
<table border="5" cellpadding= '8' >  
<tr>
<th>Select</th>
<th>Id</th>
<th>Name</th>
<th>Fname</th>
<th>Phone number</th>
<th>Address</th>
</tr>  
   <c:forEach var="employee" items="${list}">   
   <tr> 
    
   
   <td><input type = "radio" name = "key" value = "${employee.id}" ></td>
   <td>${employee.id}</td>  
   <td>${employee.name}</td>
   <td>${employee.fname}</td>
   <td>${employee.phnum}</td>
   <td>${employee.address}</td>
   
   </tr>  
   </c:forEach>  
   </table>
   <br>
   <br>
      <input type = "submit" name = "action" value = "update"> 
      <input type = "submit" name = "action" value = "delete"> 
   <br/>  
   <!-- <form action = "updateStudent">
   <input type = "submit" value = "update">
    <form action = "deleteStudent">
   <input type = "submit" value = "delete"> -->
   <br><br>
   <a href="index.jsp">Home Page</a> 
   
   </center>
   </html> 