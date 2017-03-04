<%-- 
    Document   : newPost
    Created on : Mar 1, 2017, 12:07:14 PM
    Author     : Ele Thompson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post | Discussion Forum</title>
        <!-- BOOTSTRAP CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <p class="pull-right alert alert-success">${username} is logged in</p>
            </div>
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">
                    <h1>Create a New Post</h1>
                    <a href="LoadPosts">View All Posts</a>

                    <form action="CreatePost" method="POST">
                        <div class="form-group">
                            <label for="content" class="control-label">Post Content:</label>
                            <textarea name="content" class="form-control"></textarea>
                        </div>
                        <input type="submit" value="Submit Post" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
