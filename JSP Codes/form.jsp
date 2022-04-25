<%@ page language="java" contentType="text/html;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<title>JSP session object</title>
</head>
<body>
<% session.setAttribute("user","admin"); %>
<a href="form2.jsp">Click here to get user name</a>
</body>
</html>
