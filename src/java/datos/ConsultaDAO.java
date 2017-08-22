/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import java.util.Collection;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.text.SimpleDateFormat;
//import java.util.Date;

//import modelo.ConsultaDTO;
import conexion.Conexion;
import static conexion.Conexion.getConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.UsuariosDTO;
/**
 *
 * @author SChaves
 */
public class ConsultaDAO {
    private static String tabla = "consulta";
    private boolean errorB;
    private String errorStr;
//    SimpleDateFormat fecha;
//    SimpleDateFormat hora;
//    SimpleDateFormat date;
//    
//     public ConsultaDAO() {
//      errorB = false;
//      errorStr = "";
//      fecha = new SimpleDateFormat("yyyy-MM-dd");
//      hora = new SimpleDateFormat("hh:mm:ss");
//      date = new  SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//    }
//    
//    public Collection<ConsultaDTO> selectConsulta(){
//    Connection cnn = null;
//    Statement stm = null;
//    ResultSet rs = null;
//
//    try {
//      cnn = Conexion.getConexion();
//      String sentenciaSQL = "select * from " + tabla;
//      stm = cnn.createStatement();
//      rs = stm.executeQuery(sentenciaSQL);
//      ArrayList<ConsultaDTO> listaConsulta = new ArrayList<ConsultaDTO>();
//
//      while (rs.next()) {
//        ConsultaDTO consulta = new ConsultaDTO();
//        consulta.setIdConslta(rs.getInt("IdConsulta"));        
//        consulta.setIdPaciente(rs.getString("IdPaciente"));
//        consulta.setFechaConsulta(rs.getDate("FechaConsulta"));
//        consulta.setHoraConsulta(rs.getDate("HoraConsulta"));
//        consulta.setFechaRegla(rs.getDate("FechaRegla"));
//        consulta.setqFuma(rs.getInt("qFuma"));
//        consulta.setqToma(rs.getInt("qToma"));
//        consulta.setIdFumar(rs.getInt("IdFumar"));
//        consulta.setIdAlcohol(rs.getInt("IdAlcohol"));
//        consulta.setConsultaInicial(rs.getString("ConsultaInicial"));
//        consulta.setUbicacion(rs.getString("Ubicacion"));
//        listaConsulta.add(consulta);
//      }
//      return listaConsulta;
//    } catch (SQLException e) {
//      Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
//      throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al obtener los datos> ", e);
//    } finally {
//      try {
//        if (rs != null) {
//          rs.close();
//        }
//        if (stm != null) {
//          stm.close();
//        }
//      } catch (Exception e) {
//        Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e.getMessage());
//        throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al cerrar la conexión> ", e);
//      }
//    }
//  }
//      
//  public ConsultaDTO selectConsultaPaciente(String Id){
//    Connection cnn = null;
//    Statement stm = null;
//    PreparedStatement pstm = null;
//    ResultSet rs = null;
//    java.sql.Date fi = new java.sql.Date(0);
//    
//    try {
//      cnn = Conexion.getConexion();
//      //String sentenciaSQL = "select * from " + tabla + " where IdPaciente=?";
//      String sentenciaSQL = "SELECT IdConsulta,IdPaciente,FechaConsulta, concat(FechaConsulta,' ',HoraConsulta) as HoraConsulta, FechaRegla, qFuma,qToma,IdFumar,IdAlcohol,ConsultaInicial,Ubicacion FROM dengue.consulta where IdPaciente=?";
//      pstm = cnn.prepareStatement(sentenciaSQL);
//      pstm.setString(1, Id);
//      stm = cnn.createStatement();
//      rs = pstm.executeQuery();
//      Date h;                
//      ConsultaDTO consulta = null;
//
//      if (rs.next()) {
//        consulta = new ConsultaDTO();        
//        consulta.setIdConslta(rs.getInt("IdConsulta"));        
//        consulta.setIdPaciente(rs.getString("IdPaciente"));
//        consulta.setFechaConsulta(rs.getDate("FechaConsulta"));
//        consulta.setHoraConsulta(rs.getDate("HoraConsulta"));
//                
//        try{
//          consulta.setFechaRegla(rs.getDate("FechaRegla"));  
//        } catch(SQLException e) {
//          consulta.setFechaRegla(fi);
//        }               
//        
//        consulta.setqFuma(rs.getInt("qFuma"));
//        consulta.setqToma(rs.getInt("qToma"));
//        consulta.setIdFumar(rs.getInt("IdFumar"));
//        consulta.setIdAlcohol(rs.getInt("IdAlcohol"));
//        consulta.setConsultaInicial(rs.getString("ConsultaInicial"));
//        consulta.setUbicacion(rs.getString("Ubicacion"));        
//      }
//      return consulta;
//      
//    } catch (SQLException e) {
//      Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
//      throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al obtener los datos> ", e);
//    } finally {
//      try {
//        if (rs != null) {
//          rs.close();
//        }
//        if (stm != null) {
//          stm.close();
//        }
//      } catch (Exception e) {
//        Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e.getMessage());
//        throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al cerrar la conexión> ", e);
//      }
//    }
//  }    
//    
//    public int selectLastIdConsulta(){
//    Connection cnn = null;
//    Statement stm = null;
//    ResultSet rs = null;
//    int kNo=0;
//
//    try {
//      cnn = Conexion.getConexion();
//      String sentenciaSQL = "select MAX(IdConsulta) as No from " + tabla;
//      stm = cnn.createStatement();
//      rs = stm.executeQuery(sentenciaSQL);
//      while (rs.next()) {
//        kNo=rs.getInt("No");
//      }
//      
//      return kNo;
//    } catch (SQLException e) {
//      Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
//      throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al obtener los datos> ", e);
//    } finally {
//      try {
//        if (rs != null) {
//          rs.close();
//        }
//        if (stm != null) {
//          stm.close();
//        }
//      } catch (Exception e) {
//        Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e.getMessage());
//        throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al cerrar la conexión> ", e);
//      }           
//    }    
//  }  
//  
//    
//
//    public int selectAskExisteConsulta(String Id) {
//      Connection cnn = null;
//      Statement stm = null;
//      PreparedStatement pstm = null;
//      ResultSet rs = null;
//      int IdConsulta=0;
//
//      try {
//        cnn = Conexion.getConexion();
//        String sentenciaSQL = "SELECT ifnull(IdConsulta,0) as Id FROM "+ tabla +" where IdPaciente=?;";     
//        pstm = cnn.prepareStatement(sentenciaSQL);
//        pstm.setString(1, Id);        
//        stm = cnn.createStatement();
//        rs = pstm.executeQuery();
//                              
//        if (rs.next()) {                   
//          IdConsulta=rs.getInt("Id");          
//        }
//        return IdConsulta;
//
//      } catch (SQLException e) {
//          
//        Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
//        throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al obtener los datos> ", e);
//        //return IdConsulta;
//      } finally {
//        try {
//          if (rs != null) {
//            rs.close();
//          }
//          if (stm != null) {
//            stm.close();
//          }
//        } catch (Exception e) {
//          Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e.getMessage());
//          throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al cerrar la conexión> ", e);
//        }
//      }        
//    }    
//  
//  public boolean insertConsulta(ConsultaDTO cons) {
//    Connection cnn = null;
//    PreparedStatement pstm = null;
//    ResultSet rs = null;
//
//    try {
//      cnn = Conexion.getConexion();
//      String sentenciaSQL = "insert into " + tabla + "(IdConsulta,IdPaciente,FechaConsulta,HoraConsulta,FechaRegla,qFuma,qToma,IdFumar,IdAlcohol,ConsultaInicial,Ubicacion) values(?,?,?,?,?,?,?,?,?,?,?)";
//      pstm = cnn.prepareStatement(sentenciaSQL);
//      pstm.setInt(1, cons.getIdConslta());
//      pstm.setString(2, cons.getIdPaciente());
//      pstm.setString(3, fecha.format(cons.getFechaConsulta()));
//      pstm.setString(4, hora.format(cons.getHoraConsulta()));
//      pstm.setString(5, fecha.format(cons.getFechaRegla()));
//      pstm.setInt(6, cons.getqFuma());
//      pstm.setInt(7, cons.getqToma());
//      pstm.setInt(8, cons.getIdFumar());
//      pstm.setInt(9, cons.getIdAlcohol());
//      pstm.setString(10, cons.getConsultaInicial());
//      pstm.setString(11, cons.getUbicacion());
//      
//      if (pstm.executeUpdate() > 0) {
////      if (pstm.executeQuery()> 0) {
//        return true;
//      }
//      return false;
//    } catch (SQLException e) {
//      errorB=true;
//      Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
//      throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al obtener los datos> ", e);
//      
//    } finally {
//      try {
//        if (rs != null) {
//          rs.close();
//        }
//        if (pstm != null) {
//          pstm.close();
//        }
//      } catch (Exception e) {
//        Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e.getMessage());
//        throw new RuntimeException(ConsultaDAO.class.getName() + " <Error al cerrar la conexión> ", e);
//      }
//    }
//  }
    
    
    public boolean autenticacionUsuario(UsuariosDTO us)
    {
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try
        {
            String consulta = "select * from usuarios where usuario = ? and password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, us.getNombre());
            pst.setString(2, us.getPass());
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
    
    public boolean registrarUsuario(UsuariosDTO us){
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
