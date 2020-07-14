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
public class Vehiculo {
    private int num_serie;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(int num_serie, String marca) {
        this.num_serie = num_serie;
        this.marca = marca;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
