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
public class Vehiculo implements Serializable{
    private String placa;
    private String marca;
    private String referencia;
    private String modelo;
    private int idNom;

    public Vehiculo() {
        this.placa= "";
        this.marca="";
        this.referencia= "";
        this.modelo="";
        this.idNom=0;
        
    }

    public Vehiculo(String placa, String marca, String referencia, String modelo, int idNom) {
        this.placa = placa;
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.idNom = idNom;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdNom() {
        return idNom;
    }

    public void setIdNom(int idNom) {
        this.idNom = idNom;
    }
    
}
