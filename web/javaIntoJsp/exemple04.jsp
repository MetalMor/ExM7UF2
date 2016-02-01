<%-- 
    Document   : exemple04
    Created on : 01-feb-2016, 16:58:09
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
        <%!
            private String aleatori() {
                return ("<H2>" + Math.random() + "</H2>");
            }
        %>
        <%= aleatori()%>
    </body>
</html>
