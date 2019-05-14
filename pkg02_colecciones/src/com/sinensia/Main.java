package com.sinensia;

 
import com.sinensia.dao.ProbandoDAO;
import static com.sinensia.dao.ProbandoDAO.probarCliente;
import com.sinensia.genericos.ProbandoGenericos;
import com.sinensia.poo_avanzado.ProbandoAnimales;
import com.sinensia.pruebas.Herencia;
import com.sinensia.pruebas.Fechas;
import com.sinensia.pruebas.Colecciones;
import static com.sinensia.pruebas.Ficheros.probarEscritura;
import com.sinensia.pruebas.Polimorfismo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            probarEscritura();
            /*probarCliente();
            ProbandoDAO.probarProducto();
            ProbandoGenericos.probarMetodo();
            Colecciones.ejemploHashMap();
            Colecciones.ejemploListas();
            Fechas.probar();
            Herencia.probandoHerencia();
            Polimorfismo.polimorfeando();
            Polimorfismo.polimorfeandoConListas();
            Colecciones.ejemploSet();
            ProbandoAnimales.probarClasesAbstractas();*/
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    


     
    
}
