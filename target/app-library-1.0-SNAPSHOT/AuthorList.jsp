<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>AuthorList</title>
</head>
<body>
    <c:forEach items="${authors}" var="a">
        ${a.nom} ${a.prenom} ${a.pseudo} ${a.nationalite}
        <c:if test="${a.naissance != null}">
            ${a.naissance}
        </c:if>
        <br/>
    </c:forEach>
</body>
</html>
