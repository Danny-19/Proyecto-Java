/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Funcion;
import models.Pelicula;

/**
 *
 * @author juan pablo cano
 */
@WebServlet(name = "PeliculasUsuario", urlPatterns = {"/PeliculasUsuario"})
public class PeliculasUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("Pelis", Pelicula.pelis);
        RequestDispatcher view = request.getRequestDispatcher("peliculasUsuario.jsp");
        view.forward(request, response);
        
        
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*HttpSession session = request.getSession();
        List<Integer> sillasDisponibles_ = new ArrayList<Integer>();
        if (null != session.getAttribute("Pelis")) {
            sillasDisponibles_ = (ArrayList<Integer>) session.getAttribute("Pelis");
        }
        int p = Integer.parseInt(request.getParameter("numSilla"));
        sillasDisponibles_.remove(p+1);
        session.setAttribute("Pelis", sillasDisponibles_);
        request.setAttribute("Pelis", sillasDisponibles_);
        RequestDispatcher view = request.getRequestDispatcher("peliculasUsuario.jsp");
        view.forward(request, response);*/
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
