<%-- 
    Document   : scriptureList
    Created on : Feb 28, 2017, 1:02:17 PM
    Author     : 0249239
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scripture List</title>
    </head>
    <body>
        <div>
            Scriptures:<br><br>
            <c:forEach var="scripture" items="${scriptures}">
                <strong>${scripture.book}</strong> ${scripture.chapter}:${scripture.verse}<br>
            </c:forEach>
        </div>
    </body>
</html>
