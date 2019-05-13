/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */
public class Producto {
    protected long id;
    protected String nombre;  
    private long precio;
    private long stock;

    public Producto(long id, String nombre, long precio) {
        this.id = id;   
        if (nombre == null || nombre == ""){
            System.err.println("Nombre de proucto inválido");
        }
        this.id = id;
        this.nombre = nombre; 
        this.precio = precio;
        this.stock = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
    
    
    
}
