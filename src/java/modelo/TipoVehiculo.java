package modelo;

import java.io.Serializable;

/**
 *
 * @author 503
 */
public class TipoVehiculo implements Serializable{
    
    //Atributos
    private int idTipoV;
    private String nombreTipoV;
    
    //constructores
    public TipoVehiculo() {
        this.idTipoV= 0;
        this.nombreTipoV="";
    }

    public TipoVehiculo(int idTipoV, String nombreTipoV) {
        this.idTipoV = idTipoV;
        this.nombreTipoV = nombreTipoV;
    }
    
    //Getters ana Setters
    public int getIdTipoV() {
        return idTipoV;
    }

    public void setIdTipoV(int idTipoV) {
        this.idTipoV = idTipoV;
    }

    public String getNombreTipoV() {
        return nombreTipoV;
    }

    public void setNombreTipoV(String nombreTipoV) {
        this.nombreTipoV = nombreTipoV;
    }
    
    
    
    
}
