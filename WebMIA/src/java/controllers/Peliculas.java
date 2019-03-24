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
import models.Pelicula;

/**
 *
 * @author juan pablo cano
 */
@WebServlet(urlPatterns = {"/Peliculas"})
public class Peliculas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();       
        List<Pelicula> pelis = new ArrayList<Pelicula>();   
        if(null != session.getAttribute("Pelis")){
            pelis=(ArrayList<Pelicula>) session.getAttribute("Pelis");
        }
        request.setAttribute("pelis", pelis);   
        RequestDispatcher view = request.getRequestDispatcher("peliculas.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();       
        List<Pelicula> pelis = new ArrayList<Pelicula>();  
   
        if(null != session.getAttribute("Pelis")){
            pelis=(ArrayList<Pelicula>) session.getAttribute("Pelis");
        }
        String name = request.getParameter("name");
        String genero = request.getParameter("genero");
        int edad = Integer.parseInt(request.getParameter("edad"));
        int valoracion = Integer.parseInt(request.getParameter("valoracion")); 
        Pelicula p = new Pelicula(name,genero,edad,valoracion);
        pelis.add(p);
        session.setAttribute("Pelis", pelis);
        request.setAttribute("pelis", pelis);        
        RequestDispatcher view = request.getRequestDispatcher("peliculas.jsp");
        view.forward(request, response);
    }
}
    