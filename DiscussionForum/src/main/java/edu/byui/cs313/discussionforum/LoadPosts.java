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
@WebServlet(name = "LoadPosts", urlPatterns = {"/LoadPosts"})
public class LoadPosts extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Create a list array to store each Post in
        List<Post> posts = new ArrayList<Post>();
        
        // Declare the file path
        File file = new File(getServletContext().getRealPath("/") + "file.txt");
        
        // If the file doesn't already exist, create a new one
        if(!file.exists()) {
            file.createNewFile();
        }
        
        // Create the file reader
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        // Read the file
        String line;
        while((line = reader.readLine()) != null) {
            Post post = new Post(line);
            //post.setContent(line);  // Add content from the file to the Post instance
            posts.add(post);         // Add post to the array
        }
        
        request.setAttribute("posts", posts);
        request.getRequestDispatcher("showPosts.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO: doPost actions
    }

}
