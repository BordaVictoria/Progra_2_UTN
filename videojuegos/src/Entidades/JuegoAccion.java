
package Entidades;

import java.util.ArrayList;

public class JuegoAccion extends Juego {
    
    public JuegoAccion(String titulo, Double pesoGB,ArrayList<TipoConsolas> arrayconsolas) {
        super(titulo,pesoGB);
        super.consolasCompatibles = arrayconsolas;
    }
    
   
}
