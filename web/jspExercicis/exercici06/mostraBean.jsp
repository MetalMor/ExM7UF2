<%-- 
    Document   : mostraBean
    Created on : 22-feb-2016, 10:09:51
    Author     : becari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP - Exercici 06</title>
    </head>
    <body>
        <jsp:useBean id="persona" class="jsp.exercici06.Personal" />
        <jsp:setProperty name="persona" property="dni" param="dni" />
        <jsp:setProperty name="persona" property="nom" param="nom" />
        <h1>Dades del bean:</h1><br>
        <label>DNI: </label><jsp:getProperty name="persona" property="dni" /><br>
        <label>Nom: </label><jsp:getProperty name="persona" property="nom" /><br>
    </body>
</html>
