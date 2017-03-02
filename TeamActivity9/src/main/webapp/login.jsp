<%-- 
    Document   : login
    Created on : Feb 28, 2017, 9:42:20 PM
    Author     : vmthompson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Team Activity 9 Login</title>
    </head>
    <body>
        <c:if test="${not empty error}">
            <p>${error}</p>
        </c:if>
        
        <form action="Login" method="POST">
            Username: <input type="text" name="username"><br>
            Password: <input type="password" name="password"><br>
            <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
