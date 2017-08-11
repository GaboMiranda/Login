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
        <title>JSP Page</title>
    </head>
    <body class="body">
        <h1 class="h1">Acceso satisfactorio <%out.print(usuario);%> </h1><br>
        <a href="menu2.jsp">menu2</a>
        <a href="registro.jsp">Regístrate.</a><br>
        <form action="salir" method="post">
            <input type="submit" class="btn-danger" value="Cerrar sesión" />
        </form>
    </body>
</html>
