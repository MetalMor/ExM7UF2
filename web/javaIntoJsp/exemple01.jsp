<%-- 
    Document   : exemple
    Created on : 01-feb-2016, 16:36:57
    Author     : mor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemple01</title>
    </head>
    <body>
        <h2>JSP Expressions</h2>
        <ul>
            <li>Data: <%= new java.util.Date()%></li>
            <li>Server: <%= application.getServerInfo()%></li>
            <li>Sessio ID: <%= session.getId()%></li>
            <li>paràmetre <%= request.getParameter("p")%></li>
        </ul>
    </body>
</html>
