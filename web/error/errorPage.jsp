<%-- 
    Document   : errorPage
    Created on : 01-feb-2016, 17:13:14
    Author     : mor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page isErrorPage="true" %> <%-- pàgina de tractament d'errors --%>
        S'ha produït l'error <i><%= exception%></i>. 
        <pre>
            <%@ page import="java.io.*" %>
            <% exception.printStackTrace(new PrintWriter(out));%>
        </pre>
    </body>
</html>
