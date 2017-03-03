<%-- 
    Document   : login
    Created on : Mar 1, 2017, 11:51:52 AM
    Author     : Ele Thompson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login | Discussion Forum</title>
        <!-- BOOTSTRAP CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">
                    <h1>Login</h1>
                    
                    <form action="SignIn" method="POST">
                        <div class="form-group">
                            <label for="username" class="control-label">Username:</label>
                            <input type="text" class="form-control" name="username" required>
                        </div>
                        <div class="form-group">
                            <label for="password" class="control-label">Password:</label>
                            <input type="password" class="form-control" name="password" required>
                        </div>
                        <input type="submit" value="Sign In" class="btn btn-primary">
                    </form>
                    
                    <c:forEach var="user" items="${users}" >
                        <p><strong>User:</strong> ${user.username} <strong>Password:</strong> ${user.password}</p>
                    </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>
