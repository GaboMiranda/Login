/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global contenedor */

/**
 * Comment
 */
$(document).ready(inicializa);

function inicializa(){
  $("#agregar").click(registro);
  $("#cancelar").click(menu);
}

function menu(){
    $("#contenedor").empty();
}


function registro(){
    $("#contenedor").empty();
    $("#contenedor").append("<div class='container'>"+
            "<div class='row conborde'>"+
            "<div class='col-sm-4'>"+
            "</div>"+
            "<div class='col-sm-4 fondo-registro'>"+   
                "<h1 class='h1'>Registro</h1>"+
                "<form action='nuevoUsuario' method='post'>"+
                    "<input type='text' class='form-control' name='nombre' placeholder='Nombre' required />"+
                    "<input type='text' class='form-control' name='aPaterno' placeholder='Apellido paterno' required />"+
                    "<input type='text' class='form-control' name='aMaterno' placeholder='Apellido materno'/>"+
                    "<input type='text' class='form-control' name='usuario' placeholder='Usuario' required autocomplete='off' />"+
                    "<input type='password' class='form-control' name='pass' placeholder='Contraseña'required />"+
                    "<input type='tel' class='form-control' name='tel' placeholder='Teléfono'/>"+
                    "<input type='email' class='form-control' name='correo' placeholder='Correo electrónico' required autocomplete='off' />"+
                    "<input type'number' class='' name='nivel' min='1' required/>"+
                    "<input class='btn btn-primary form-control' type='submit' value='Registrar' />"+
                    "<a class='btn btn-danger form-control' href='menu.jsp' value='Cancelar'>Cancelar</a>"+
                "</form>"+
            "</div>"+
            "<div class='col-sm-4'>"+    
            "</div>"+
            "</div>"+
        "</div>");
}