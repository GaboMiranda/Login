/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import negocio.Fachada;

/**
 *
 * @author andres
 */
public class inicioSesion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            UsuariosDTO us = new UsuariosDTO();
            //Se crean dos variables las cuales contendrán los datos para iniciar sesión que son usuario y password.
            us.setNombre(request.getParameter("usuario")); 
            us.setPass(request.getParameter("pass"));
            //Se crea una instancia de la clase Consultas.
            Fachada fa = new Fachada();
            //Se realiza la llamada al método autenticacion que se encuentra en la clase Consultas, que nos devolverá un booleano dependiendo 
            //si se encontró el usuario y contraseña, entre un true o false 
            if(fa.autenticarUsuario(us)){
            //Se crea una instancia de HttpSession.
                HttpSession objsesion = request.getSession(true);
                //Se envía a la instancia de HttpSession el valor de la variable usuario una vez que ya ha sido validado. 
                objsesion.setAttribute("usuario", us.getNombre());
                response.sendRedirect("Interfaz/admin/menuUsuarios.jsp");
            }else
                //Si el resultado de la consulta es false se redirecciona a la página inicial que es el index.html
                response.sendRedirect("index.jsp");
            
        }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
