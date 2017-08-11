/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gabo
 */
public class Consultas extends Conexion{
        
    public boolean autenticacion (String usuario, String pass)
    {
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try
        {
            String consulta = "select * from usuarios where usuario = ? and password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            
            if(rs.absolute(1))
            {
                return true;
            }
        }catch(SQLException e)
        {
            System.out.println("Error "+e);
        }finally
        {
            try
            {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            }catch(SQLException e)
            {
                
            }
        }
        return false;
    }
    
    public boolean registrar(String nombre, String aPaterno,String aMaterno, String usuario, String pass,String tel, String correo){
        PreparedStatement pst = null;
        try{
            String consulta = "insert into usuarios (nombre, a_paterno, a_materno, usuario, password, tel, correo) values(?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, aPaterno);
            pst.setString(3, aMaterno);
            pst.setString(4, usuario);
            pst.setString(5, pass);
            pst.setString(6, tel);
            pst.setString(7, correo);
            
            if(pst.executeUpdate() == 1) return true;
            
        } catch(SQLException ex){
            
        }finally{
            try{
            if(getConexion() != null) getConexion().close();
            if(pst != null) pst.close();
            }catch(SQLException ex){
                System.out.println("Error "+ ex);
            }
        }
        return false; 
    }
    
//        private static class main  {
//
//        public static void main(String[] args) throws SQLException {
//            Consultas con = new Consultas();
//            System.out.println(con.registrar("karla", "gonzález", "sánchez", "kgonzalez", "1234", "1111111111", "karla@karla.com"));
//        }
//    }
}
