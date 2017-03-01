package edu.cs313.byui.scriptures;

import edu.cs313.byui.scriptures.model.FileScriptureHandler;
import edu.cs313.byui.scriptures.model.Scripture;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CreateScripture", urlPatterns = {"/CreateScripture"})
public class CreateScripture extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get input from the form
        String book = request.getParameter("txtBook");
        int chapter = Integer.parseInt(request.getParameter("txtChapter"));
        int verse = Integer.parseInt(request.getParameter("txtVerse"));
        
        // Create a new Scripture object
        Scripture newScripture = new Scripture(book, chapter, verse);
        
        // Add new Scripture object to the list of scriptures
        FileScriptureHandler handler = new FileScriptureHandler("list.txt");
        handler.addScripture(newScripture);
        
        // Redirect to the ShowList page
        response.sendRedirect("ShowList");
    }

}
