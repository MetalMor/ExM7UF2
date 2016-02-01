<%-- 
    Document   : exemple03
    Created on : 01-feb-2016, 16:48:45
    Author     : mor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<title>Color Testing</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<%
    String bgColor = request.getParameter("bgColor");
    if ((bgColor == null) || (bgColor.trim().equals(""))) {
        bgColor = "WHITE";
    }
%>
<body bgcolor="<%= bgColor%>">
    </body>
</html>
