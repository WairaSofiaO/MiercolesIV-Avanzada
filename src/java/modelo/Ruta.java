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
public class Ruta implements Serializable{
    private int id;
    private String estacion;
    private String idVehiculo;

    public Ruta() {
    }

    public Ruta(int id, String estacion, String idVehiculo) {
        this.id = id;
        this.estacion = estacion;
        this.idVehiculo = idVehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    
    
    
}
