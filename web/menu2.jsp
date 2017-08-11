<%-- 
    Document   : menu2
    Created on : 9/08/2017, 03:22:51 PM
    Author     : andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

    HttpSession objsesion = request.getSession(false);
    String usuario = (String)objsesion.getAttribute("usuario") ;
    if(usuario.equals("")){
        response.sendRedirect("index.html");
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Acceso a menú 2 satisfactorio</h1><br>
        <a href="menu.jsp">menu1</a>
        <form action="salir" method="post">
            <input type="submit" value="Cerrar sesión" />
        </form>
    </body>
</html>
