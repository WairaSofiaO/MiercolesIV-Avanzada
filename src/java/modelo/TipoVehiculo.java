/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author 503
 */
public class TipoVehiculo implements Serializable{
    
    private int idtv;
    private String nomtv;

    public TipoVehiculo() {
        this.idtv = 0;
        this.nomtv = "";
    }

    public TipoVehiculo(int idtv, String nomtv) {
        this.idtv = idtv;
        this.nomtv = nomtv;
    }

    public int getIdtv() {
        return idtv;
    }

    public void setIdtv(int idtv) {
        this.idtv = idtv;
    }

    public String getNomtv() {
        return nomtv;
    }

    public void setNomtv(String nomtv) {
        this.nomtv = nomtv;
    }
    
    
    
}
