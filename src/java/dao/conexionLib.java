/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 503
 */
public class conexionLib {
    public static Connection conectarnosDB() {
        try {
            //datos conexion
            String dbDrive= "com.mysql.jdbc.Driver";
            String dbUrl= "jdbc:mysql://localhost:3306/";
            
            //Datos de la DB
            String dbNombre="";
            String dbUsuario = "root";
            String dbPassword = "";
            
            Class.forName(dbDrive);
            Connection conex = DriverManager.getConnection(dbUrl + dbNombre, dbUsuario, dbPassword);
            
            return conex;
             
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
    }
}
