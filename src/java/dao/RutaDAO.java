/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Ruta;

/**
 *
 * @author usuario
 */
public class RutaDAO {
    
    public static boolean insertR(Ruta r){
        
        try{
            Connection cone = conexionLib.conectarDB();
            String SQL ="INSERT INTO ruta(id,estacion, id_veh) VALUES(?,?,?)";
            PreparedStatement objPS = cone.prepareStatement(SQL);
            objPS.setInt(1,r.getId());
            objPS.setString(2,r.getEstacion());
            objPS.setString(3,r.getIdVehiculo());
            
            
            return objPS.executeUpdate()>0;
            
        }catch(SQLException ex){
            return false;
        }
    }
}
