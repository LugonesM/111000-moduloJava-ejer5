/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.practica_herencia;

/**
 *
 * @author mel
 */
public class Bicicleta extends Vehiculo{
    
    private String marchas;
    private String rodado;

    public Bicicleta() {
    }

   public Bicicleta(String marchas, String rodado, int numSerie, String marca) {
        super(numSerie, marca);
        this.marchas = marchas;
        this.rodado = rodado;
    }

    public String getMarchas() {
        return marchas;
    }

    public void setMarchas(String marchas) {
        this.marchas = marchas;
    }

    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }
    
    
    
}