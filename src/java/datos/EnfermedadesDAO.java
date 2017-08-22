/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.EnfermedadesDTO;

/**
 *
 * @author Bruno
 */
public class EnfermedadesDAO {
   private static String tabla = "enfermedades";
    private boolean errorB;
    private String errorStr;
    
    
    public EnfermedadesDAO() {
      errorB = false;
      errorStr = "";
                 
    }
                   
    public EnfermedadesDTO selectEnfermedadesConsulta(Integer Id){
      Connection cnn = null;
      Statement stm = null;
      PreparedStatement pstm = null;
      ResultSet rs = null;
      //java.sql.Date fi = new java.sql.Date(0);

      try {
        cnn = Conexion.getConexion();
        String sentenciaSQL = "select * from " + tabla + " where IdConsulta=?";
        //String sentenciaSQL = "SELECT IdFebril,IdConsulta,FechaInicio,HoraInicio,NoDiasFiebre,NoHorasFiebre FROM dengue.febril where IdConsulta=?;";
        pstm = cnn.prepareStatement(sentenciaSQL);
        pstm.setInt(1, Id);
        
        stm = cnn.createStatement();
        rs = pstm.executeQuery();

        EnfermedadesDTO datos = null;

        if (rs.next()) {
          datos = new EnfermedadesDTO(); 
          datos.setIdEnfermedades(rs.getInt("IdEnfermedades"));
          datos.setIdConsulta(rs.getInt("IdConsulta"));
          datos.setDiabetes(rs.getInt("Diabetes"));        
          datos.setHipertension(rs.getInt("Hipertension"));
          datos.setSIDA(rs.getInt("SIDA"));
          datos.setCancer(rs.getInt("Cancer"));
          datos.setAsma(rs.getInt("Asma"));
          datos.setRinitis(rs.getInt("Rinitis"));
          datos.setAlergias(rs.getInt("Alergias"));       
          datos.setArtritis(rs.getInt("Artritis"));       
          datos.setECardiovascular(rs.getInt("EnfCardiovascular"));       
          datos.setEAutoinmune(rs.getInt("EnfAutoinmune"));       
          datos.setDepresion(rs.getInt("Depresion"));       
          datos.setEPsiquiatrica(rs.getInt("EnfPsiquiatrica"));                               
        }
        return datos;

      } catch (SQLException e) {
        Logger.getLogger(EnfermedadesDAO.class.getName()).log(Level.SEVERE, null, e);
        throw new RuntimeException(EnfermedadesDAO.class.getName() + " Error al obtener los datos > ", e);
      } finally {
        try {
          if (rs != null) {
            rs.close();
          }
          if (stm != null) {
            stm.close();
          }
        } catch (Exception e) {
          Logger.getLogger(EnfermedadesDAO.class.getName()).log(Level.SEVERE, null, e.getMessage());
          throw new RuntimeException(EnfermedadesDAO.class.getName() + " Error al cerrar la conexion > ", e);
        }
      }
    }        
  
  /**
   * @return the errorB
   */
  public boolean getErrorB() {
    return errorB;
  }
  
  /**
   * @return the errorStr
   */
  public String getErrorStr() {
    return errorStr;
  }        
}
