package com.sinensia;

import com.sinensia.dao.GenericoDAO;

//Llamada a una clase anidada dentro de GenericoDAO
public class Cliente extends Entidad implements Comparable<Cliente>{
    
    protected String nombre;  //si fuera private, no lo vería ningún objeto fuera de esta clase. Lo pongo protected para que lo vean también los hijos (protected)
    private String email;
    private boolean activo;

    public Cliente(long id, String nombre, String email) /*throws Exception */ {
        //this.id = id;    //el this.id se refiere al id de la variable atributo de la clase. id sin this es id recibido como parámetro
        //En el método constructor, meto una validación.
        super(id);
        if (nombre == null || nombre == ""){
           // throw new Exception("Nombre de cliente inválido");
            System.err.println("Nombre de cliente inválido");
        }
        this.nombre = nombre; 
        this.email = email;
        this.activo=true;
        
    }
    
    /*public long getId(){
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }*/

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        //Metemos la misma validación que al constructor de la clase cliente, para validar que el nombre tenga un valor
        if (nombre == null || nombre == ""){
           // throw new Exception("Nombre de cliente inválido");
            System.err.println("setNombre: Nombre de cliente inválido");
        }
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    public void mostrar(){
        //Diferentes formas de recuperar el valor de las variables de clase:
        System.out.println("Cliente NORMAL: " + nombre);
        System.out.println("     Id: " + this.id);
        System.out.println("     Email: " + this.getEmail());
        
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Cliente [" + id + ", " + nombre + ", " + email + "]";
    }

    @Override
    public int compareTo(Cliente otroCli) {
        //comparamos por nombre, por el compareTo de String
        if (nombre.compareTo(otroCli.nombre)==0){
            return email.compareTo(otroCli.email);
        }else {
            return nombre.compareTo(otroCli.nombre);
        }
    }
}
