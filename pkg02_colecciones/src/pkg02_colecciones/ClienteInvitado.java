/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

/**
 *
 * @author Admin
 */
public class ClienteInvitado extends Cliente {
    //cuando construyo un hijo, de alguna manera tengo que llamar al constructor del padre
    public ClienteInvitado(long id, String nombre, String email) {
        super(id, nombre, email); //super es la clase padre. por lo tanto, llamo al constructor del padre.
    }
    
    private int duracionMaxima;

    /**
     * Get the value of duracionMaxima
     *
     * @return the value of duracionMaxima
     */
    public int getDuracionMaxima() {
        return duracionMaxima;
    }

    /**
     * Set the value of duracionMaxima
     *
     * @param duracionMaxima new value of duracionMaxima
     */
    public void setDuracionMaxima(int duracionMaxima) {
        this.duracionMaxima = duracionMaxima;
    }

}
