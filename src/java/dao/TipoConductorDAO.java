/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.TipoConductor;

/**
 *
 * @author usuario
 */
public class TipoConductorDAO {
    
    public static boolean insertTc(TipoConductor tc){
        
        try{
            Connection cone = conexionLib.conectarDB();
            String SQL ="INSERT INTO tipo_conductor(id, nombre) VALUES(?,?)";
            PreparedStatement objPS = cone.prepareStatement(SQL);
            objPS.setInt(1,tc.getId());
            objPS.setString(2,tc.getNombre());
            
            return objPS.executeUpdate()>0;
            
        }catch(SQLException ex){
            return false;
        }
        
    }
}
