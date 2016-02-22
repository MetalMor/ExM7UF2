<%-- 
    Document   : form
    Created on : 22-feb-2016, 11:01:54
    Author     : becari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlets - Form</title>
    </head>
    <body>
        <h1>Omple les dades:</h1>
        <form action="/Exercicis_m7uf2/CompletaDades">
            <label>Nom: </label><input type="text" name="nom" /><br>
            <label>Num fills: </label><input type="number" name="numFills" /><br>
            <label>Casat? </label><br>
            <select name="casat" >
                <option value="true" />Sí<br>
                <option value="false" />No<br>
            </select><br>
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
