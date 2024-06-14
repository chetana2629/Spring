<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h1 style="color:White;background-color:green">

<%
Object currentUser=
session.getAttribute("validUser");
%>
<h2>Current logged in user= <%=currentUser %></h2>
</h1>
</body>
</html>