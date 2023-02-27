<%-- 
    Document   : welcome
    Created on : Feb 27, 2023, 1:26:37 AM
    Author     : Yemufu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
    <h1>Welcome <%=session.getAttribute("username") %>!</h1>
    <form action="logout" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>

