<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fresh lead</title>
</head>
<body>
  <h2>Lead  | save</h2>
  <form action="savedLead"method="post">
  <pre>
  First Name<input type = "text" name="firstName"/>
  LAst Name <input type = "text" name="lastName"/>
  Email     <input type = "text" name="email"/>
  Mobile    <input type = "text" name="mobile"/>
  <input type = "submit" value="save"/>
  </pre>
  </form> 
  ${msg}
</body>
</html>