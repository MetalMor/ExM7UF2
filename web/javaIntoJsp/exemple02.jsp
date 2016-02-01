<%-- 
    Document   : exemple02
    Created on : 01-feb-2016, 16:46:28
    Author     : mor
    Nota       : ESTO ESTÁ MUY MAL HECHO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriptlet</title>
    </head>
    <body>
        <% if (Math.random() < 0.5) { %>
        Hola<b>món</b>!
        <% } else { %>
        adéu
        <% }%>
    </body>
</html>
