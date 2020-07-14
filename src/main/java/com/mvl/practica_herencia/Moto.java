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
public class Moto extends Vehiculo  {
    private int cant_cilindros_motor;
    private float peso;

    public Moto() {
    }

    public Moto(int cant_cilindros_motor, float peso, int num_serie, String marca) {
        super(num_serie,marca);
        this.cant_cilindros_motor = cant_cilindros_motor;
        this.peso = peso;
    }

    public int getCant_cilindros_motor() {
        return cant_cilindros_motor;
    }

    public float getPeso() {
        return peso;
    }

    public void setCant_cilindros_motor(int cant_cilindros_motor) {
        this.cant_cilindros_motor = cant_cilindros_motor;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
    
    
    
}
