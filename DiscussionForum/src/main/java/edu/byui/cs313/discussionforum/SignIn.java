package edu.byui.cs313.discussionforum;

import edu.byui.cs313.discussionforum.model.Post;
import edu.byui.cs313.discussionforum.model.User;
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
        // Create a list array to store each username and password in
        // from the file
        List<User> users = new ArrayList<User>();
        
        // Declare the file path
        File file = new File(getServletContext().getRealPath("/") + "login.txt");
        
        // If the file doesn't already exist, create a new one
        if(!file.exists()) {
            file.createNewFile();
        }
        
        // Create the file reader
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        // Read the file
        String line;
        while((line = reader.readLine()) != null) {
            User user = new User();
            user.setUsername(line);
            user.setPassword(line);
            users.add(user);         // Add post to the array
        }
        request.setAttribute("users", users);
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
        
        // Create a list array to store each username and password in
        // from the file
        List<User> users = new ArrayList<User>();
        
        // Declare the file path
        File file = new File(getServletContext().getRealPath("/") + "login.txt");
        
        // If the file doesn't already exist, create a new one
        if(!file.exists()) {
            file.createNewFile();
        }
        
        // Create the file reader
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        // Read the file
        String line;
        while((line = reader.readLine()) != null) {
            User user = new User();
            user.loadFromFileString(line);
            users.add(user);         // Add post to the array
        }
        
        // Compare form input with saved usernames and passwords
        for(User user : users) {
            if(user.comparePasswords(username, password)) {
                // Create new session variable
                request.getSession().setAttribute("username", username);
                // Redirect to new post page
                response.sendRedirect("newPost.jsp");
            }
        }
        
        // Incorrect username/passord
        // Redirect to incorrect login page
        response.sendRedirect("incorrectLogin.jsp");
        
        //if(username.equals(correctUsername) && password.equals(correctPassword)) {
            // Create new session variable
            //request.getSession().setAttribute("username", username);
            // Redirect to new post page
            //response.sendRedirect("newPost.jsp");
        //} else {
            // Incorrect username/passord
            // Redirect to incorrect login page
            //response.sendRedirect("incorrectLogin.jsp");
        //}
    }

}
