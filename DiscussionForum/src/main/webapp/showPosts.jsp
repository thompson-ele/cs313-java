<%-- 
    Document   : showPosts
    Created on : Mar 1, 2017, 12:07:23 PM
    Author     : Ele Thompson
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Posts | Discussion Forum</title>
        <!-- BOOTSTRAP CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">
                    <div class="row">
                        <p class="pull-right alert alert-success">${username} is logged in</p>
                    </div>
                    
                    <h1>View Posts</h1>
                    
                    <a href="newPost.jsp" class="btn btn-success">Create a New Post</a>
                    
                    <c:forEach var="post" items="${posts}" >
                        <p><strong>Post:</strong> ${post.content}</p>
                        <!--<p><strong>Created By:</strong> </p>
                        <p><strong>Date:</strong> </p>-->
                    </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>
