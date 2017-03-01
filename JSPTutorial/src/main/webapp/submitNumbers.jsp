<%-- 
    Document   : submitNumbers
    Created on : Feb 28, 2017, 12:28:32 PM
    Author     : 0249239
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number Submission</title>
    </head>
    <body>
        <form action="ComputeSum" method="GET">
            First Number: <input type="text" name="first"><br>
            Second Number: <input type="text" name="second"><br>
            <input type="submit" value="Compute Sum">
        </form>
    </body>
</html>
