/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Clase que contiene/manipula la cadena de conexión.
 *
 * @author barce
 * @version CRUD basico v 1.0.
 * @since desde la versión 1.8 del JDK/SDK
 */
public class Conexion {

  private static String driver = "com.mysql.jdbc.Driver";  
  private static String ip = "localhost";
  private static String db = "dengue";
  private static String user = "dengue";
  private static String pass = "d3ngu3.we";
  private static String url = "jdbc:mysql://localhost/" + db;

  private static Connection cnn = null;

  /**
   * Devuelve la cadena de conexión"
   *
   * @author barce
   * @version dengue v 1.0.
   * @since desde la versión 1.0 del JDK/SDK
   */
  public static Connection getConexion() {
    try {
      if (cnn == null) {               
        Class.forName(driver);                
        cnn = DriverManager.getConnection(url, user, pass);        
      }
      return cnn;
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("Error al crear la conexión>", e);
    }
  }
  
  
   public static Connection getConexionF(){
     try{
       if (cnn == null){
         Runtime.getRuntime().addShutdownHook(new MiClaseFinalizar());
         ResourceBundle archivoConfiguracion = ResourceBundle.getBundle("datosConexion");
         String manejador = archivoConfiguracion.getString("manejador");
         String cadenaConexion = archivoConfiguracion.getString("cadenaconexion");
         String clave = archivoConfiguracion.getString("clave");
         String usuario = archivoConfiguracion.getString("usuario");
         System.out.println(manejador);
         System.out.println(cadenaConexion);
         System.out.println(clave);
         System.out.println(usuario);

         Class.forName(manejador);
         cnn = DriverManager.getConnection(cadenaConexion,usuario,clave);
       }
       return cnn;
     }catch(Exception e){
       e.printStackTrace();
       throw new RuntimeException("Error al crear la conexión>",e);
     }
   }
  
  private static class MiClaseFinalizar extends Thread {

    @Override
    public void run() {
      try {
        Connection unaConexion = Conexion.getConexion();
        unaConexion.close();
      } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException("Error al cerrar la conexión>", e);
      }
    }
  }

}
