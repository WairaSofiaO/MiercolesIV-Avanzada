/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Vehiculo;

/**
 *
 * @author 503
 */
public class VehiculoDAO {
    //Método Insert
    public static boolean insertV(Vehiculo v){
        
        try{
            Connection cone = conexionLib.conectarDB();
            String SQL ="INSERT INTO vehiculo(placa, marca,referancia, modelo,id_nomb) VALUES(?,?,?,?,?)";
            PreparedStatement objPS = cone.prepareStatement(SQL);
            objPS.setString(1,v.getPlaca());
            objPS.setString(2,v.getMarca());
            objPS.setString(3,v.getModelo());
            objPS.setString(4,v.getReferencia());
            objPS.setInt(5,v.getIdNom());
            
            return objPS.executeUpdate()>0;
            
        }catch(SQLException ex){
            return false;
        }
        
    }
}
