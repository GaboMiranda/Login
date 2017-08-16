<%-- 
    Document   : menu
    Created on : 9/08/2017, 02:11:31 PM
    Author     : andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 

    HttpSession objsesion = request.getSession(false);
    String usuario = (String)objsesion.getAttribute("usuario");
    if(usuario.equals("")){
        response.sendRedirect("index.html");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css"/>
        <link rel="stylesheet" href="css/style.css"/>
        <script src="js/jquery-3.2.1.min.js" lenguaje="javascript" type="text/javascript"></script>
        <script src="js/usuarios.js" lenguaje="javascript" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body class="body">
        <form action="salir" method="post">
            <input type="submit" class="btn-danger" value="Cerrar sesión" />
        </form>
        <section id="contenedor"><input type="button" id="agregar" value="agregar usuario"/></section>
    </body>
</html>
