package edu.byui.cs313.teamactivity9;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Declare correct username and password
        String correctUsername = "userId";
        String correctPassword = "test123";
        
        // Grab the incoming datas
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            // Set the session stuff yasss
            request.getSession().setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
        } else {
            // Something was incorrect
            request.setAttribute("error", "Yo crap is broken");
            // Redirect back to login.jsp
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
        
        
    }

}
