/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cs313.byui.scriptures;

import edu.cs313.byui.scriptures.model.FileScriptureHandler;
import edu.cs313.byui.scriptures.model.HardCodedScriptureHandler;
import edu.cs313.byui.scriptures.model.Scripture;
import edu.cs313.byui.scriptures.model.ScriptureDataHandler;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 0249239
 */
@WebServlet(name = "ShowList", urlPatterns = {"/ShowList"})
public class ShowList extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ScriptureDataHandler handler = new FileScriptureHandler("list.txt");
        
        request.setAttribute("scriptures", handler.getFavoriteScriptures());
        request.getRequestDispatcher("scriptureList.jsp").forward(request,response);
    }

}
