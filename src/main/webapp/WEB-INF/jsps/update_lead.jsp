<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update lead</title>
</head>
<body>
  <h2>Lead  | Update</h2>
  <form action="updateLead"method="post">
  <pre>
		 id<input type="text" name="id" value="${lead.id}"/>
		 First Name<input type = "text" name="firstName" value="${lead.firstName}"/>
		 LAst Name <input type = "text" name="lastName" value="${lead.lastName}"/>
		 Email     <input type = "text" name="email" value="${lead.email}"/>
		 Mobile    <input type = "text" name="mobile" value="${lead.mobile}"/>/>
		 <input type = "submit" value="update"/>
  </pre>
  </form> 
  ${msg}
</body>
</html>