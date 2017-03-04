package edu.byui.cs313.discussionforum;

import edu.byui.cs313.discussionforum.model.Post;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ele Thompson
 */
@WebServlet(name = "SignIn", urlPatterns = {"/SignIn"})
public class SignIn extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form input
        String username = request.getParameter("username");
        String password = request.getParameter("password");
              
        // Declare correct username and password
        String correctUsername = "ele";
        String correctPassword = "cs313";
        
        // Compare username and password to correct values
        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            // Create new session variable
            request.getSession().setAttribute("username", username);
            // Redirect to new post page
            response.sendRedirect("newPost.jsp");
        } else {
            // Incorrect username/passord
            // Redirect to incorrect login page
            response.sendRedirect("incorrectLogin.jsp");
        }
    }

}
