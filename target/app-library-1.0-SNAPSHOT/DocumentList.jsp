<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>DocumentList</title>
</head>
<body>
    <c:forEach items="${documents}" var="l">
        ${l.titre} ${l.isbn} ${l.numPages} ${l.type} ${l.author.nom} ${l.author.prenom}
        <c:if test="${l.creation != null}">
            ${l.creation}
        </c:if>
        <br/>
    </c:forEach>
</body>
</html>
