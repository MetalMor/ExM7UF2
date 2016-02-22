<%-- 
    Document   : result
    Created on : 22-feb-2016, 11:18:27
    Author     : becari
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlets - Exercici06</title>
    </head>
    <body>
        
        <jsp:useBean id="persona" class="servlets.exercici06.beans.Persona" />
        <jsp:setProperty name="persona" property="nom" value="${param.nom}" />
        <jsp:setProperty name="persona" property="numFills" value="${param.numFills}" />
        <jsp:setProperty name="persona" property="casat" value="${param.casat}" />
        
        <h1>Dades: </h1>
        <label>Nom: </label>${persona.nom}<br>
        <label>Num fills: </label>${persona.numFills}<br>
        <label>Casat? </label>${persona.casat}
        
    </body>
</html>
