package com.library.app_library;

import com.library.entities.Auteur;
import com.library.entities.DocElec;
import com.library.entities.Document;
import com.library.entities.Livre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@WebServlet(name = "DocElecServlet", value = "/doc")
public class DocElecServlet extends HttpServlet {
    private ArrayList<DocElec> docE;

    public void init() { docE = new ArrayList<>(); }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/CreateDocElec.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Auteur> auteurs = (ArrayList<Auteur>) request.getSession().getAttribute("authors");

        int numPages = Integer.parseInt(request.getParameter("numPages"));
        String type = request.getParameter("type");
        String adresseInternet = request.getParameter("adresse");
        int author = Integer.parseInt(request.getParameter("author"));

        DocElec d = new DocElec();

        d.setAuteur(auteurs.stream().filter(a -> a.getId() == author).findFirst().get());
        d.setType(type);
        d.setNumPages(numPages);
        d.setAdresseInternet(adresseInternet);

        if (request.getSession().getAttribute("DocE") == null) {
            docE.add(d);
            request.getSession().setAttribute("DocE", docE);
        } else {
            ((ArrayList<DocElec>) request.getSession().getAttribute("DocE")).add(d);
        }

        response.sendRedirect(request.getContextPath() + "/DocumentElecList.jsp");
    }
}

