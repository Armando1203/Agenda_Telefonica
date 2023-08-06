
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.SQLException;

public class Conexion {
    
    Connection conexion = null;
    
    String user = "Gambit";
    String password = "Sql120397admin";
    String database = "Agenda_Telefonica";
    String server = "DESKTOP-4JK1SBU\\SQLEXPRESS";
    String port = "1433";
    
    public Connection obtenerConexion(){
        
        try 
        {
            String cadena = "jdbc:sqlserver://"+server+":"+port+";databaseName="+database;
            conexion = DriverManager.getConnection(cadena, user, password);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion no exitosa: "+e.toString());
        }
        
        return conexion;
    }
    
}
