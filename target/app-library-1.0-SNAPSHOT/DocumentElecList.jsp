<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Documents Electroniques</title>
</head>
<body>
<c:forEach items="${DocE}" var="d">
    ${d.auteur.nom} ${d.auteur.prenom} ${d.adresseInternet} ${d.numPages} ${d.type}
</c:forEach>
</body>
</html>
