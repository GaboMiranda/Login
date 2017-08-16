<%-- 
    Document   : registro
    Created on : 9/08/2017, 01:44:35 PM
    Author     : andres
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css"/>
        <link rel="stylesheet" href="css/style.css"/>
        <title>Registrarme</title>
    </head>
    <body class="body">
        <div class="container">
            <div class="row conborde"> 
                <div class="col-sm-4">   
                </div>
                <div class="col-sm-4 fondo-registro">   
                    <h1 class="h1">Registro</h1>
                    <form action="nuevoUsuario" method="post">
                        <input type="text" class="form-control" name="nombre" placeholder="Nombre" required />
                        <input type="text" class="form-control" name="aPaterno" placeholder="Apellido paterno" required />
                        <input type="text" class="form-control" name="aMaterno" placeholder="Apellido materno"/>
                        <input type="text" class="form-control" name="usuario" placeholder="Usuario" required autocomplete="off" />
                        <input type="password" class="form-control" name="pass" placeholder="Contraseña"required />
                        <input type="text" class="form-control" name="tel" placeholder="Teléfono"/>
                        <input type="text" class="form-control" name="correo" placeholder="Correo electrónico" required autocomplete="off" />
                        <input class="btn btn-primary form-control" type="submit" value="Registrar" />
                        <a class="btn btn-danger form-control" id="cancelar" href="menu.jsp" value="Cancelar">Cancelar</a>
                    </form>
                </div>
                <div class="col-sm-4">    
                </div>
            </div>
        </div>
    </body>
</html>