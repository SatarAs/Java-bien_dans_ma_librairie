<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${not empty authors}">
        <form method="post" action="book">
            <input type="text" name="titre" placeholder="Titre"/>
            <input type="number" name="numPages" placeholder="Nombre de pages"/>
            <input type="text" name="isbn" placeholder="isbn"/>
            <input type="date" name="creation"/>
            <input type="text" name="type" placeholder="type"/>

            <select name="author">
                <c:forEach items="${authors}" var="a">
                    <option value="${a.id}">${a.nom} ${a.prenom}</option>
                </c:forEach>
            </select>

            <input type="submit"/>
        </form>
    </c:if>
    <c:if test="${empty authors}">
        <h3>Vous devez rentrer un auteur avant de choisir un livre</h3>
    </c:if>
</body>
</html>
