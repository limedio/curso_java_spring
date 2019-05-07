
package pkg01_ejemplojava;

//si ponemos este comentario, al instanciar un objeto de esta clase, aparece este comentario.
    /**
     * Un pajaro exotico
     */
    public class Tucan {

    String[] colores;
    float longitud;
    int edad;
    
    //metodo constructor
    //no recibe parámetros
    //el constructor sirve para inicializar . por ejemplo, la longitud de un tucan al nacer es 5 
    public Tucan(){
            this.edad = 0;
            longitud = 5F; 
            colores = new String[] { "blanco", "marron"} ;
        }
    
    public void piar(){
        System.out.println("Pio pio " + edad + " años");
    
    }
    
}
