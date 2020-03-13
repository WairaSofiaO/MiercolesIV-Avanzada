/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Conductor implements Serializable{
    private int id;
    private String nombre;
    private String idTipoLicencia;
    private String idVehiculo;
    private int idTipoConductor;

    public Conductor() {
    }

    public Conductor(int id, String nombre, String idTipoLicencia, String idVehiculo, int idTipoConductor) {
        this.id = id;
        this.nombre = nombre;
        this.idTipoLicencia = idTipoLicencia;
        this.idVehiculo = idVehiculo;
        this.idTipoConductor = idTipoConductor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdTipoLicencia() {
        return idTipoLicencia;
    }

    public void setIdTipoLicencia(String idTipoLicencia) {
        this.idTipoLicencia = idTipoLicencia;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdTipoConductor() {
        return idTipoConductor;
    }

    public void setIdTipoConductor(int idTipoConductor) {
        this.idTipoConductor = idTipoConductor;
    }
    
    
    
    
}
