package com.library.app_library;

import com.library.dao.DaoFactory;
import com.library.entities.Auteur;
import com.library.entities.Nationality;

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
        request.getSession().setAttribute("authors", DaoFactory.getAuthorDao().findAll());
        response.sendRedirect(request.getContextPath() + "/Auteur.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudo = request.getParameter("pseudo");
        String nat = request.getParameter("nat");
        String naissance = request.getParameter("naissance");
        // System.out.println(naissance);

        Auteur a = new Auteur();

        a.setId(auteurs.size() + 1);
        a.setNom(nom);
        a.setPrenom(prenom);
        a.setPseudo(pseudo);
        if (nat.compareTo("FR") == 0) {
            a.setNationalite(Nationality.FR);
        } else if (nat.compareTo("US") == 0) {
            a.setNationalite(Nationality.US);
        } else if (nat.compareTo("EN") == 0) {
            a.setNationalite(Nationality.EN);
        } else if (nat.compareTo("IT") == 0) {
            a.setNationalite(Nationality.DE);
        } else if (nat.compareTo("GE") == 0) {
            a.setNationalite(Nationality.ES);
        } else {
            a.setNationalite(Nationality.BE);
        }
        if (!naissance.equals(""))
            a.setNaissance(LocalDate.parse(naissance, DateTimeFormatter.ofPattern("yyyy-MM-dd")));


        // auteurs.add(a);

        // request.getSession().setAttribute("authors", auteurs);
        DaoFactory.getAuthorDao().create(a);
        response.sendRedirect(request.getContextPath() + "/AuthorList.jsp");
    }
}
