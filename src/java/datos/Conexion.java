/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabo
 */
public class Conexion {
    private String USERNAME = "root";
    private String PASSWORD = "root.123";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "usuarios";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
    
    
    public Conexion() 
    {
        try
        {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error "+e);
        }            
    }
    
    public Connection getConexion(){
        return con;
    }
    
//    private static class main  {
//
//        public static void main(String[] args) throws SQLException {
//            Conexion con = new Conexion();
//        }
//    }
    
}
