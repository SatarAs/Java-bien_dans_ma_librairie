<%--
  Created by IntelliJ IDEA.
  User: SatarAs
  Date: 19/03/2021
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mon Auteur</title>
</head>
<body>
    <form method="post" action="auteur">
        <input type="text" name="nom"/>
        <input type="text" name="prenom"/>
        <input type="text" name="pseudo"/>
        <input type="date" name="naissance"/>
        <input type="date" name="deces"/>
        <input type="radio" name="nat" value="FR" checked/>FR
        <input type="radio" name="nat" value="DE" checked/>DE
        <input type="radio" name="nat" value="EN" checked/>EN
        <input type="radio" name="nat" value="ES" checked/>ES
        <input type="radio" name="nat" value="US" checked/>US
        <input type="radio" name="nat" value="BE" checked/>BE


        <input type="submit"/>
    </form>
</body>
</html>
