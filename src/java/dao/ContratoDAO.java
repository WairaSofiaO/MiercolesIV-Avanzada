/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Contrato;

/**
 *
 * @author usuario
 */
public class ContratoDAO {
    
    public static boolean insertCon(Contrato con){
        
        try{
            Connection cone = conexionLib.conectarDB();
            String SQL ="INSERT INTO contrato(id, id_veh, id_cond) VALUES(?,?,?)";
            PreparedStatement objPS = cone.prepareStatement(SQL);
            objPS.setInt(1,con.getId());
            objPS.setString(2,con.getIdVehiculo());
            objPS.setInt(3,con.getIdConductor());
            
            return objPS.executeUpdate()>0;
            
        }catch(SQLException ex){
            return false;
        }
        
    }
}
