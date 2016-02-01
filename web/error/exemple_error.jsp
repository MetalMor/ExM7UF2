<%-- 
    Document   : exemple_error
    Created on : 01-feb-2016, 17:12:02
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
        <%-- redirecció en cas d'error --%>
        <%@ page errorPage="/error/errorPage.jsp" %> 
        <%!
            private double toDouble(String value) {
                return (Double.parseDouble(value));
            }
        %>
        
        <%= toDouble(request.getParameter("nombre")) %>
    </body>
</html>
