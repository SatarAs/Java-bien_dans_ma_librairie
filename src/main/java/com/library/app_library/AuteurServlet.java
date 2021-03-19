package com.library.app_library;

import com.library.entities.Auteur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
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

        Auteur a = new Auteur();

        a.setNom(nom);
        a.setPrenom(prenom);
        a.setPseudo(pseudo);
        a.setNationalite(nationalite);

        auteurs.add(a);
    }
}
