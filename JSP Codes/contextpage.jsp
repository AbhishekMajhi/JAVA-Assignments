<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PageContextExample</title>
</head>
<body>
<% pageContext.setAttribute("course","JSP",pageContext.PAGE_SCOPE);
String name = (String)pageContext.getAttribute("course");
out.println("Course name is " +name);%>
</body>
</html>
