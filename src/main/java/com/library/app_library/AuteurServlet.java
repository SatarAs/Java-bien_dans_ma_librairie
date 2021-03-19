package com.library.app_library;

import com.library.entities.Auteur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@WebServlet(name = "AuteurServlet", value = "/auteur")
public class AuteurServlet extends HttpServlet {
    private ArrayList<Auteur> auteurs;

    public void init() {
        auteurs = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/Auteur.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudo = request.getParameter("pseudo");
        String nationalite = request.getParameter("nationalite");
        String naissance = request.getParameter("naissance");
        // System.out.println(naissance);

        Auteur a = new Auteur();

        a.setId(auteurs.size() + 1);
        a.setNom(nom);
        a.setPrenom(prenom);
        a.setPseudo(pseudo);
        a.setNationalite(nationalite);
        if (!naissance.equals(""))
            a.setNaissance(LocalDate.parse(naissance, DateTimeFormatter.ofPattern("yyyy-MM-dd")));


        auteurs.add(a);

        request.getSession().setAttribute("authors", auteurs);
        response.sendRedirect(request.getContextPath() + "/AuthorList.jsp");
    }
}
