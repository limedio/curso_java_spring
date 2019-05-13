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
    protected String nombre;  //si fuera private, no lo vería ningún objeto fuera de esta clase. Lo pongo protected para que lo vean también los hijos (protected)
    private String email;
    private boolean activo;
    
}
