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
import modelo.UsuariosDTO;

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
    
    public boolean registrar(UsuariosDTO us){
        PreparedStatement pst = null;
        try{
            String consulta = "insert into usuarios (nombre, a_paterno, a_materno, usuario, password, tel, correo, nivel) values(?,?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, us.getNombre());
            pst.setString(2, us.getaPaterno());
            pst.setString(3, us.getaMaterno());
            pst.setString(4, us.getUsuario());
            pst.setString(5, us.getPass());
            pst.setString(6, us.getTel());
            pst.setString(7, us.getCorreo());
            pst.setInt(8, us.getNivel());
            
            
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
