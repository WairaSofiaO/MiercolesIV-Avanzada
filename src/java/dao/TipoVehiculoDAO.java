package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.TipoVehiculo;

/**
 *
 * @author 503
 */
public class TipoVehiculoDAO {
    
    //Método Insert
    public static boolean insertTV(TipoVehiculo tv){
        
        try{
            Connection cone = conexionLib.conectarDB();
            String SQL ="INSERT INTO tipo_vehiculo(id, nombre) VALUES(?,?)";
            PreparedStatement objPS = cone.prepareStatement(SQL);
            objPS.setInt(1,tv.getIdTipoV());
            objPS.setString(2,tv.getNombreTipoV());
            
            return objPS.executeUpdate()>0;
            
        }catch(SQLException ex){
            return false;
        }
        
    }
    
    public static boolean deleteTV(TipoVehiculo tv){
        
        try{
            Connection cone = conexionLib.conectarDB();
            String SQL ="DELETE FROM tipo_vehiculo WHERE id =?";
            PreparedStatement objPS = cone.prepareStatement(SQL);
            objPS.setInt(1,tv.getIdTipoV());
            //objPS.setString(2,tv.getNombreTipoV());
            
            return objPS.executeUpdate()==0;
            
        }catch(SQLException ex){
            return false;
        }
        
    }
    
    
}
