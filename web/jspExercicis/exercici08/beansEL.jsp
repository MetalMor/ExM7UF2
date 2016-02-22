<%-- 
    Document   : login
    Created on : 22-feb-2016, 10:32:40
    Author     : becari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP - Exercici07</title>
    </head>
    <body>
        <jsp:useBean id="usuari" class="jsp.exercici08.Usuari" />
        <jsp:setProperty name="usuari" property="nick" value="${param.nick}" />
        <jsp:setProperty name="usuari" property="password" value="${param.password}" />
        <h1>Propietats del bean: </h1>
        <label>Nick: </label>${usuari.nick}<br>
        <label>Password: </label>${usuari.password}
    </body>
</html>
