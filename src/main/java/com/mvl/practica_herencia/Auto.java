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
public class Auto extends Vehiculo {
    private int cant_puertas;
    private String color;

    public Auto() {
    }

    public Auto(int cant_puertas, String color, int num_serie, String marca) {
        super(num_serie,marca);
        this.cant_puertas = cant_puertas;
        this.color = color;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
   
    
    
    
    
}
