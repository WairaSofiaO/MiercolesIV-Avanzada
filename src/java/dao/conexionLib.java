package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 503
 */
public class conexionLib {
    
   public static Connection conectarDB(){
       
       try {
          //Datos conexion DB
          String dbDrive = "com.mysql.jdbc.Driver";
          String dbUrl = "jdbc:mysql://localhost:3306/";
          
          //Datos de DB
          String dbNombre = "taller_cesde";
          String dbUsuario = "root";
          String dbPassword = "";
          
          Class.forName(dbDrive);
          Connection objConex = DriverManager.getConnection(dbUrl + dbNombre, dbUsuario , dbPassword);
          
          return objConex;
       }catch(ClassNotFoundException | SQLException ex){
           return null;
       }
       
   }
   
   
}
