/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conductor;

/**
 *
 * @author usuario
 */
public class ConductorDAO {
    //Método Insert
    public static boolean insertC(Conductor c){
        
        try{
            Connection cone = conexionLib.conectarDB();
            String SQL ="INSERT INTO conductor(id, nombre, tipo_licencia, id_veh, id_tipo_cond) VALUES(?,?,?,?,?)";
            PreparedStatement objPS = cone.prepareStatement(SQL);
            objPS.setInt(1,c.getId());
            objPS.setString(2,c.getNombre());
            objPS.setString(3,c.getIdTipoLicencia());
            objPS.setString(4,c.getIdVehiculo());
            objPS.setInt(5,c.getIdTipoConductor());
            
            return objPS.executeUpdate()>0;
            
        }catch(SQLException ex){
            return false;
        }
        
    }
}
