package com.library.app_library;

import com.library.entities.Auteur;
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

@WebServlet(name = "LivreServlet", value = "/book")
public class LivreServlet extends HttpServlet {
    private ArrayList<Document> documents;

    public void init() { documents = new ArrayList<>(); }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/CreateBook.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Auteur> auteurs = (ArrayList<Auteur>) request.getSession().getAttribute("authors");

        String titre = request.getParameter("titre");
        int numPages = Integer.parseInt(request.getParameter("numPages"));
        String type = request.getParameter("type");
        String isbn = request.getParameter("isbn");
        String creation = request.getParameter("creation");
        int author = Integer.parseInt(request.getParameter("author"));

        Livre l = new Livre();

        l.setAuthor(auteurs.stream().filter(a -> a.getId() == author).findFirst().get());
        l.setTitre(titre);
        l.setType(type);
        l.setNumPages(numPages);
        l.setIsbn(isbn);
        if (!creation.equals(""))
            l.setCreation(LocalDate.parse(creation, DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        if (request.getSession().getAttribute("documents") == null) {
            documents.add(l);
            request.getSession().setAttribute("documents", documents);
        } else {
            ((ArrayList<Livre>) request.getSession().getAttribute("documents")).add(l);
        }

        response.sendRedirect(request.getContextPath() + "/DocumentList.jsp");
    }
}
