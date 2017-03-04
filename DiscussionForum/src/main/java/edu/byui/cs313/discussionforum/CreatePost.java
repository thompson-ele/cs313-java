package edu.byui.cs313.discussionforum;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ele Thompson
 */
@WebServlet(name = "CreatePost", urlPatterns = {"/CreatePost"})
public class CreatePost extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO: doGet actions
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get form input
        String content = request.getParameter("content");
        // TODO: Get session username
        // TODO: Get today's date and time
        
        // Declare output file location
        File file = new File(getServletContext().getRealPath("/") + "file.txt");
        
        // If the file doesn't already exist, create a new one
        if(!file.exists()) {
            file.createNewFile();
        }
        
        BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
        // Write to the file using the BufferedWriter
        // writeln()
        out.write(content + "\n");
        out.close();
        
        response.sendRedirect("LoadPosts");
    }

}
