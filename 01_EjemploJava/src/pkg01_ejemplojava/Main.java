package pkg01_ejemplojava;

public class Main {

    public static void main(String[] args) {
        boolean condicion = 5 == 5 && true; 
        if (3 > 5) {
            if (condicion || false) 
            { 
                System.out.println("Es verdadero");
            }
        } else if (5 > 7) {
            System.out.println("No se ejecuta");
        } else if (8 > 9) {
            System.out.println("No se ejecuta");
        } else {
            System.out.println("Cualquier otro caso");
        }
        
        char letra = 'B';
        switch (letra){
            case 'A':
                System.out.println("Es la letra A");
                break;
            case 'B':
                System.out.println("Es la letra B");
                break;
            case 'C':
                System.out.println("Es la letra C");
                break;
        }
        String formateado = nombreApell("Luis", "Imedio Criado");
        System.out.println(formateado);
        
        
        Tucan miPajaro = new Tucan();
        miPajaro.longitud = 20.5F;
        System.out.println("Long tucan:" + miPajaro.longitud);
        
        Tucan otroPajaro = new Tucan();
        otroPajaro.longitud = 30.9F;
       
        System.out.println("Long mi tucan :" + miPajaro.longitud);
        System.out.println("Long otro Pajaro:" + otroPajaro.longitud);
        
        otroPajaro = miPajaro; 
        //es el mismo objeto. los dos apuntan a la misma dirección de memoria 
        //Si modifico uno, modifico el otro.
        
        otroPajaro.edad=11;
        System.out.println("la edad de mipajaro es :" + miPajaro.edad);
        //puedo acceder al objeto a traves de miPajaro o de otroPajaro.
        
        otroPajaro.piar();
        miPajaro.piar();
        
        //uso de constructor:
        Tucan nuevoTuc = new Tucan();
        System.out.println("Nuevo tucan: " + nuevoTuc.longitud);
     
        
    }
    
     /*no hace falta public porque estoy en la misma clase*/
        static String nombreApell(String nombre, String apellidos){
            return apellidos + ", " + nombre;
        }
    
}
