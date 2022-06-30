<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL PAYMENT-ADMIN LOGIN</title>
<link rel="stylesheet" type="text/css" href="/style1.css">

</head>
<body>
<div class="header1">
<h1>BILL PAYMENT-ADMIN LOGIN</h1>
${message }

</div>

<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="/adminlogin" method="post" modelAttribute="admin" style="margin-top:50px;">

<table align="center">
<tr>
<td align="left" style="width:10rem;padding: 5px; margin-left: 0;">User Name</td>
<td>

<form:input path="username" class="form-control"/>
<br>
 <form:errors path="username" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td align="left" style="width:10rem;padding: 5px; margin-left: 0;">Password</td>
<td><form:password path="password" class="form-control"/>
<br>
<form:errors path="password" cssClass="errors"></form:errors>
</td>
</tr>






<tr>

<td colspan="2" align="center"><input type="submit" value="Login" class="formsubmitbutton" />

</tr>
</table>



</form:form>



</div>

<a href="/">Home</a>
</div>
</body>
</html>