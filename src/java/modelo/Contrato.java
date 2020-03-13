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
public class Contrato implements Serializable{
    private int id;
    private String idVehiculo;
    private int idConductor;

    public Contrato() {
    }

    public Contrato(int id, String idVehiculo, int idConductor) {
        this.id = id;
        this.idVehiculo = idVehiculo;
        this.idConductor = idConductor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }
    
    
}
