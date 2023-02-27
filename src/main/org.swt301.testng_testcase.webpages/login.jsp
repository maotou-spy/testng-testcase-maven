<%-- 
    Document   : login.jsp
    Created on : Feb 27, 2023, 1:14:57 AM
    Author     : Yemufu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
    <h1>Login Page</h1>
    <form action="LoginServlet" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username"><br><br>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password"><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>

